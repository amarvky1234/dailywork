package com.jpql.test;

import com.jpql.entities.Product;
import com.jpql.helper.EMFRegistry;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class PaginationTest {
    public static void main(String[] args) {

        try {
            allProducts(1, 3);
        }finally {
            EMFRegistry.closeEntityManagerFactory();
        }
    }

    private static void allProducts(int pageNo, int pageSize){
        EntityManagerFactory entityManagerFactory = null;
        TypedQuery<Product> allProductQuery = null;
        EntityManager entityManager = null;
        List<Product> products = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            allProductQuery = entityManager.createQuery("from Product p order by p.productName", Product.class);
            allProductQuery.setMaxResults(pageSize);
            allProductQuery.setFirstResult((pageNo-1)*pageSize);

            products = allProductQuery.getResultList();

            products.forEach(System.out::println);
        }finally {
            if (entityManager !=null){
                entityManager.close();
            }
        }
    }
}
