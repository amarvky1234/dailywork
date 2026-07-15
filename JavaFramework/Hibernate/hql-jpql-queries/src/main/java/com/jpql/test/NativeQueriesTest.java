package com.jpql.test;

import com.jpql.entities.BasicProduct;
import com.jpql.entities.Product;
import com.jpql.helper.EMFRegistry;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class NativeQueriesTest {
    public static void main(String[] args) {

        try {
            //showAllProductAdhoc();
            //showProductByCategoryNamedNativeQuery("Electronics");
            //showProductsBetweenPriceBasedOnPrice(25000, 100000);
            showBasicProductGreaterThanPrice(10000);
        }finally {
            EMFRegistry.closeEntityManagerFactory();
        }
    }

    private static void showAllProductAdhoc(){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        Query allProductsQuery = null;
        List<Object[]> rows = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            allProductsQuery = entityManager.createNativeQuery("select p.product_no, p.product_nm, p.category, p.price from product_hql p");
            rows = allProductsQuery.getResultList();

            rows.stream().forEach(row -> {
                System.out.println(row[0] + " , " + row[1] + " , " + row[2] + " , " + row[3]);
            });
        }finally {
            if (entityManager !=null){
                entityManager.close();
            }
        }
    }


    private static void showProductByCategoryNamedNativeQuery(String category){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        Query allProductsQuery = null;
        List<Object[]> rows = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            allProductsQuery = entityManager.createNamedQuery("productByCategory");
            allProductsQuery.setParameter("category", category);
            rows = allProductsQuery.getResultList();

            rows.stream().forEach(row -> {
                System.out.println(row[0] + " , " + row[1] + " , " + row[2] + " , " + row[3]);
            });
        }finally {
            if (entityManager !=null){
                entityManager.close();
            }
        }
    }


    //map each record of the query into entity mapping
    private static void showProductsBetweenPriceBasedOnPrice(double minPrice, double maxPrice){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        Query allProductsQuery = null;
        List<Product> products = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            allProductsQuery = entityManager.createNativeQuery
                    ("select p.product_no, p.product_nm, p.description, p.category, p.price, p.manufacturer_no from product_hql p where p.price between :minPrice and :maxPrice", Product.class);
            allProductsQuery.setParameter("minPrice", minPrice);
            allProductsQuery.setParameter("maxPrice", maxPrice);
            products = allProductsQuery.getResultList();

            products.stream().forEach(product -> {
                System.out.println(product);
            });
        }finally {
            if (entityManager !=null){
                entityManager.close();
            }
        }
    }


    //@SqlResultSetMapping to map the record into arbitrary object
    private static void showBasicProductGreaterThanPrice(double price){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        Query allProductsQuery = null;
        List<BasicProduct> products = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            allProductsQuery = entityManager.createNativeQuery
                    ("select p.product_no, p.product_nm, p.description, p.category, p.price, p.manufacturer_no from product_hql p" +
                            " where p.price > :price", "BasicProductMapping");
            allProductsQuery.setParameter("price", price);
            products = allProductsQuery.getResultList();

            products.stream().forEach(product -> {
                System.out.println(product);
            });
        }finally {
            if (entityManager !=null){
                entityManager.close();
            }
        }
    }
}
