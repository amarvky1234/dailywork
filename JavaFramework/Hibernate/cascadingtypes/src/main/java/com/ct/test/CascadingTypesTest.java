package com.ct.test;

import com.ct.entities.Author;
import com.ct.entities.Book;
import com.ct.helper.EMFRegistry;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Set;

public class CascadingTypesTest {
    public static void main(String[] args) {

        try {
            //cascadeTypePersist();
            //cascadeTypeMerge();
            cascadeTypeRemove();
        }finally {
            EMFRegistry.closeEntityManagerFactory();
        }
    }
    private static void cascadeTypePersist(){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        boolean flag = false;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            Author author = Author.of()
                    .dob(LocalDate.now().minusDays(7434))
                    .fullName("Steve Johnson")
                    .contactNo("8767493984")
                    .gender("Male")
                    .emailAddress("steve@gamil.com").build();

            Book book = Book.of()
                    .title("All times New york city")
                    .language("English")
                    .genre("fiction")
                    .publishedDate(LocalDate.now().minusDays(5000))
                    .author(author).build();

            entityManager.persist(book);
            flag = true;
        }finally {
            if (entityTransaction !=null){
                if (flag){
                    entityTransaction.commit();
                }else{
                    entityTransaction.rollback();
                }
                entityManager.close();
            }
        }
    }

    private static void cascadeTypeMerge(){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        boolean flag = false;
        String isbn = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            Author author = Author.of()
                    .dob(LocalDate.now().minusDays(8937))
                    .fullName("Greg Stevenson")
                    .contactNo("8767494567")
                    .gender("Male")
                    .emailAddress("gregson@gamil.com").build();
            entityManager.persist(author);

            Book book = Book.of()
                    .title("Wildlife Animal")
                    .language("English")
                    .genre("non-fiction")
                    .price(490)
                    .publishedDate(LocalDate.now().minusDays(4500))
                    .author(author).build();

            entityManager.persist(book);
            isbn = book.getIsbn();
            flag = true;
        }finally {
            if (entityTransaction !=null){
                if (flag){
                    entityTransaction.commit();
                }else{
                    entityTransaction.rollback();
                }
            }
        }

        // Fetch the above persisted book entity based on isbn
        // then update book and its associated author as well
        // try only merging the book, the associated author object will not be updated if we dont use CascadeType.MERGE
        flag = false;

        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            Book existingBook = entityManager.find(Book.class, isbn);
            Author existingAuthor = existingBook.getAuthor();

            entityManager.clear(); // detach both the entities

            existingBook.setPrice(250);
            existingAuthor.setContactNo("989898989898");
            entityManager.merge(existingBook);

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
    }


    private static void cascadeTypeRemove(){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        boolean flag = false;
        int authorId = 0;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            Author author = Author.of()
                    .dob(LocalDate.now().minusDays(9898))
                    .contactNo("8376367889")
                    .fullName("John Wick")
                    .emailAddress("john.w@gmail.com")
                    .gender("Male")
                    .build();
            entityManager.persist(author);

            Book book = Book.of()
                    .title("Holidays")
                    .language("english")
                    .publishedDate(LocalDate.now().minusDays(4500))
                    .genre("fiction")
                    .price(340)
                    .author(author)
                    .build();


            entityManager.persist(book);
            authorId = author.getAuthorId();
            flag = true;
        }finally {
            if (entityTransaction !=null){
                if (flag){
                    entityTransaction.commit();
                }else{
                    entityTransaction.rollback();
                }
            }
        }


        // let us try to delete or remove the existing author we persisted above
        flag = false;
        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            Author existingAuthor = entityManager.find(Author.class, authorId);

            // inorder to delete the author, we need to delete all the associated books of the author as below
            Set<Book> books  = existingAuthor.getBooks();

            Iterator it = books.iterator();
            while(it.hasNext()) {
                Book book = (Book) it.next();
                it.remove();
                entityManager.remove(book);
            }


            entityManager.remove(existingAuthor);

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
    }

}

