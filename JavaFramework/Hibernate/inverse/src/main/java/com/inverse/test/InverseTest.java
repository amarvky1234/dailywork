package com.inverse.test;

import com.inverse.entities.Manufacturer;
import com.inverse.entities.Product;
import com.inverse.helper.EMFRegistry;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;

public class InverseTest {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        boolean flag = false;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            Product product = Product.of()
                    .productName("Women's Gucci Skirt")
                    .description("Women's Skirt")
                    .category("Fashion and Accessories")
                    .price(22300).build();

            Manufacturer manufacturer = Manufacturer.of()
                    .businessName("Uncle Thompson Store")
                    .establishedDate(LocalDate.now().minusDays(786))
                    .contactNo("91-3456783876")
                    .emailAddress("noreply@thompsonstores.com")
                    .products(new HashSet<>(Arrays.asList(product))).build();
            product.setManufacturer(manufacturer);

            entityManager.persist(manufacturer);
            entityManager.persist(product);

            flag = true;
        }finally {
            if (entityTransaction !=null){
                if (flag){
                    entityTransaction.commit();
                }else {
                    entityTransaction.rollback();
                }
                entityManager.close();
            }
            EMFRegistry.closeEntityManagerFactory();
        }
    }
}
