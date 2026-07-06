package com.ca.test;

import com.ca.entities.Product;
import com.ca.helper.EMFRegistry;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Tuple;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class CriteriaApiTest {
    public static void main(String[] args) {

        try {
            //showAllProducts();
            //showAllProductsGreaterThanPrice(25000);
            //showProductNamesByCategory("Groceries");
            //showNoOfProductsByName("w");
            //showProductNameAndCategoryByPrice(10000);
            //showNoOfProductsByCategory();
        }finally {
            EMFRegistry.closeEntityManagerFactory();
        }
    }

    private static void showAllProducts(){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        CriteriaQuery<Product> cq = null;
        CriteriaBuilder cb = null;
        TypedQuery<Product> typedQuery = null;
        List<Product> products = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();

            cb = entityManager.getCriteriaBuilder();
            cq = cb.createQuery(Product.class);

            Root<Product> root = cq.from(Product.class);
            cq.select(root);

            typedQuery = entityManager.createQuery(cq);
            products = typedQuery.getResultList();

            for(Product product : products){
                System.out.println(product);
            }

        }finally {
            if(entityManager != null){
                entityManager.close();
            }
        }
    }

    private static void showAllProductsGreaterThanPrice(double price){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        CriteriaQuery<Product> cq = null;
        CriteriaBuilder cb = null;
        TypedQuery<Product> typedQuery = null;
        List<Product> products = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();

            cb = entityManager.getCriteriaBuilder();
            cq = cb.createQuery(Product.class);

            Root<Product> root = cq.from(Product.class);
            cq.select(root);
            //where clause
            cq.where(cb.greaterThan(root.get("price"), price));

            typedQuery = entityManager.createQuery(cq);
            products = typedQuery.getResultList();

            for(Product product : products){
                System.out.println(product);
            }

        }finally {
            if(entityManager != null){
                entityManager.close();
            }
        }
    }

    private static void showProductsByCategoryAndPrice(String category, double minPrice, double maxPrice){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        CriteriaQuery<Product> cq = null;
        CriteriaBuilder cb = null;
        TypedQuery<Product> typedQuery = null;
        List<Product> products = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();

            cb = entityManager.getCriteriaBuilder();
            cq = cb.createQuery(Product.class);

            Root<Product> root = cq.from(Product.class);
            cq.select(root);
            //where clause
            //cq.where(cb.and(cb.like(root.get("category"), category), cb.between(root.get("minPrice"), minPrice, root.get("maxPrice") , maxPrice)));

            typedQuery = entityManager.createQuery(cq);
            products = typedQuery.getResultList();

            for(Product product : products){
                System.out.println(product);
            }

        }finally {
            if(entityManager != null){
                entityManager.close();
            }
        }
    }

    private static void showProductNamesByCategory(String category){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        CriteriaQuery<String> cq = null;
        CriteriaBuilder cb = null;
        TypedQuery<String> typedQuery = null;
        List<String> products = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();

            cb = entityManager.getCriteriaBuilder();
            cq = cb.createQuery(String.class);

            Root<Product> root = cq.from(Product.class);
            cq.multiselect(root.get("productName"));
            cq.where(cb.like(root.get("category"), category));

            typedQuery = entityManager.createQuery(cq);
            products = typedQuery.getResultList();

            for(String product : products){
                System.out.println(product);
            }

        }finally {
            if(entityManager != null){
                entityManager.close();
            }
        }
    }

    private static void showNoOfProductsByName(String productName){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        CriteriaQuery<Long> cq = null;
        CriteriaBuilder cb = null;
        TypedQuery<Long> typedQuery = null;
        List<Long> products = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();

            cb = entityManager.getCriteriaBuilder();
            cq = cb.createQuery(Long.class);

            Root<Product> root = cq.from(Product.class);
            cq.multiselect(cb.count(root));
            cq.where(cb.like(root.get("productName"), "%" + productName + "%"));

            typedQuery = entityManager.createQuery(cq);
            products = typedQuery.getResultList();

            System.out.println(products.get(0));


        }finally {
            if(entityManager != null){
                entityManager.close();
            }
        }
    }

    //multi columns
    private static void showProductNameAndCategoryByPrice(double price){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        CriteriaQuery<Tuple> cq = null;
        CriteriaBuilder cb = null;
        TypedQuery<Tuple> typedQuery = null;
        List<Tuple> products = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();

            cb = entityManager.getCriteriaBuilder();
            cq = cb.createQuery(Tuple.class);

            Root<Product> root = cq.from(Product.class);
            cq.multiselect(root.get("productName"), root.get("category"));
            cq.where(cb.greaterThan(root.get("price"), price));

            typedQuery = entityManager.createQuery(cq);
            products = typedQuery.getResultList();

            products.stream().forEach(record ->{
                System.out.println(record.get(0) + "," + record.get(1));
            });
        }finally {
            if(entityManager != null){
                entityManager.close();
            }
        }
    }

    //groupBy
    private static void showNoOfProductsByCategory(){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        CriteriaQuery<Tuple> cq = null;
        CriteriaBuilder cb = null;
        TypedQuery<Tuple> typedQuery = null;
        List<Tuple> products = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();

            cb = entityManager.getCriteriaBuilder();
            cq = cb.createQuery(Tuple.class);

            Root<Product> root = cq.from(Product.class);
            cq.multiselect(cb.count(root.get("productNo")), root.get("category"));
            cq.groupBy(root.get("category"));

            typedQuery = entityManager.createQuery(cq);
            products = typedQuery.getResultList();

            products.stream().forEach(record ->{
                System.out.println(record.get(0) + "," + record.get(1));
            });
        }finally {
            if(entityManager != null){
                entityManager.close();
            }
        }
    }
}
