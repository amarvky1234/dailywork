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
import java.util.Set;

public class FetchTest {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        Manufacturer manufacturer = null;
        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();

            manufacturer = entityManager.find(Manufacturer.class, 1);
            System.out.println(manufacturer.getBusinessName());

            entityManager.close();

        }finally {
            EMFRegistry.closeEntityManagerFactory();

            if (entityManager !=null){
                entityManager.close();
            }
        }
        Set<Product> products = manufacturer.getProducts();
        System.out.println("product classType : " + products.getClass().getName());
        products.forEach(System.out::println);
    }
}

