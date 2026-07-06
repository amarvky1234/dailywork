package com.ca.test;

import com.ca.entities.Manufacturer;
import com.ca.entities.Product;
import com.ca.helper.EMFRegistry;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Tuple;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Root;

import java.time.LocalDate;
import java.util.List;

public class CriteriaApiJoinsTest {
    public static void main(String[] args) {
        try {
            showProductNameAndManufacturerByEstablishDate(LocalDate.now().minusYears(10));
            //showManufacturerBasedOnProductCategory("Home Appliance");
        }finally {
            EMFRegistry.closeEntityManagerFactory();
        }
    }

    private static void showProductNameAndManufacturerByEstablishDate(LocalDate establishDate){
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
            Join<Product, Manufacturer> join = root.join("manufacturer");
            cq.multiselect(root.get("productName"), join.get("businessName"));
            cq.where(cb.lessThan(join.get("establishedDate"), establishDate));

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

    private static void showManufacturerBasedOnProductCategory(String category){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        CriteriaQuery<Manufacturer> cq = null;
        CriteriaBuilder cb = null;
        TypedQuery<Manufacturer> typedQuery = null;
        List<Manufacturer> manufacturers = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();

            cb = entityManager.getCriteriaBuilder();
            cq = cb.createQuery(Manufacturer.class);

            Root<Manufacturer> root = cq.from(Manufacturer.class);
            Join<Manufacturer, Product> join = root.join("products");
            cq.select(root);
            cq.where(cb.like(join.get("category"), category));

            typedQuery = entityManager.createQuery(cq);
            manufacturers = typedQuery.getResultList();

            manufacturers.stream().forEach(record ->{
                System.out.println(record);
            });
        }finally {
            if(entityManager != null){
                entityManager.close();
            }
        }
    }
}
