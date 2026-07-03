package com.ct.test;

import com.ct.entities.Author;
import com.ct.entities.Book;
import com.ct.helper.EMFRegistry;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

import java.time.LocalDate;

public class CTRefreshTest {
    public static void main(String[] args) {
         try {
            cascadeTypeRefresh();
         }finally {
             EMFRegistry.closeEntityManagerFactory();
         }
    }

    private static void cascadeTypeRefresh() {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        boolean flag = false;
        String isbn = null;

        // let us store book & author entity objects, so that we can check refresh on target and associated object
        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            Author author = Author.of()
                    .dob(LocalDate.now().minusDays(8797))
                    .contactNo("8374384944")
                    .fullName("Anderson J")
                    .emailAddress("anderson.j@gmail.com")
                    .gender("Male")
                    .build();
            entityManager.persist(author);


            Book book = Book.of()
                    .title("Indian Festivals")
                    .language("english")
                    .publishedDate(LocalDate.now().minusDays(6000))
                    .genre("non-fiction")
                    .price(1340)
                    .author(author)
                    .build();

            entityManager.persist(book);
            isbn = book.getIsbn();
            flag = true;
        } finally {
            if (entityTransaction != null) {
                if (flag) {
                    entityTransaction.commit();
                } else {
                    entityTransaction.rollback();
                }
            }
        }

        // let us try fetching the author, and modify the attributes of data along with associated object
        flag = false;
        try {
            Book existingBook = entityManager.find(Book.class, isbn);
            Author existingAuthor = existingBook.getAuthor();

            existingAuthor.setGender("Female");
            existingBook.setPrice(500);

            entityManager.refresh(existingBook);

            // when we refresh the book, the associated author of the book will not be refreshed unless we use CascadeType.REFRESH
            System.out.println("gender : " + existingAuthor.getGender());
            System.out.println("price : " + existingBook.getPrice());

        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }
}
