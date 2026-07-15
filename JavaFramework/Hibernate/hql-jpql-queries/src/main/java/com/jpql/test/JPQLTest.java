package com.jpql.test;

import com.jpql.entities.BasicProduct;
import com.jpql.entities.Manufacturer;
import com.jpql.entities.Product;
import com.jpql.helper.EMFRegistry;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Tuple;
import jakarta.persistence.TypedQuery;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JPQLTest {
    public static void main(String[] args) {

        try {
            //allProducts();
            //allProductsByPriceBetween(500, 5000);
            //showProductCount();
            //showMinPrice();
            //showNoOfProductsByCategory();
            //showProductPriceAscOrDesc();
            //showBasicProductInfoByCategory("Electronics");
            //showProductsByManufacturerEstablishedDate(LocalDate.now().minusYears(10));
            //showManufacturersWhereProductPriceGreater(50000);
            //showCountOfProductByManufacturer("Philips");
            //showManufacturerAtLeastProducts(2);
            showProductForGivenManufacturerName("Philips");
        }finally {
            EMFRegistry.closeEntityManagerFactory();
        }
    }

    private static void allProducts(){
        EntityManagerFactory entityManagerFactory = null;
        TypedQuery<Product> allProductQuery = null;
        EntityManager entityManager = null;
        List<Product> products = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            allProductQuery = entityManager.createQuery("from Product", Product.class);
            products = allProductQuery.getResultList();

            products.forEach(System.out::println);
        }finally {
            if (entityManager !=null){
                entityManager.close();
            }
        }
    }

    //where clause
    private static void allProductsByPriceBetween(double minPrice, double maxPrice){
        EntityManagerFactory entityManagerFactory = null;
        TypedQuery<Product> allProductQuery = null;
        EntityManager entityManager = null;
        List<Product> products = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            allProductQuery = entityManager.createQuery("from Product p where p.price >= :minPrice and p.price <= :maxPrice", Product.class);
            allProductQuery.setParameter("minPrice", minPrice);
            allProductQuery.setParameter("maxPrice", maxPrice);

            products = allProductQuery.getResultList();

            products.forEach(System.out::println);
        }finally {
            if (entityManager !=null){
                entityManager.close();
            }
        }
    }

    //aggregate function(max,min,avg,count,sum)
    private static void showProductCount(){
        EntityManagerFactory entityManagerFactory = null;
        TypedQuery<Long> allProductQuery = null;
        EntityManager entityManager = null;
        List<Long> products = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            allProductQuery = entityManager.createQuery("select count(p) from Product p", Long.class);

            products = allProductQuery.getResultList();

            products.forEach(System.out::println);
        }finally {
            if (entityManager !=null){
                entityManager.close();
            }
        }
    }

    private static void showMinPrice(){
        EntityManagerFactory entityManagerFactory = null;
        TypedQuery<Double> allProductQuery = null;
        EntityManager entityManager = null;
        List<Double> minPrice = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            allProductQuery = entityManager.createQuery("select min(p.price) from Product p", Double.class);

            minPrice = allProductQuery.getResultList();

            System.out.println(minPrice);
            minPrice.forEach(System.out::println);
        }finally {
            if (entityManager !=null){
                entityManager.close();
            }
        }
    }


    //group by and having
    private static void showNoOfProductsByCategory(){
        EntityManagerFactory entityManagerFactory = null;
        TypedQuery<Tuple> allProductQuery = null;
        EntityManager entityManager = null;
        Map<String, Long> productCountByCategoryMap = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            allProductQuery = entityManager.createQuery("select p.category,count(p) from Product p group by p.category having count(p) > :quantity", Tuple.class);
            allProductQuery.setParameter("quantity", 1);

            productCountByCategoryMap = allProductQuery.getResultList().stream()
                    .collect(Collectors.toMap(tuple-> (String) tuple.get(0), tuple-> (Long) tuple.get(1)));

            productCountByCategoryMap.forEach((category, count) -> {
                System.out.println(category + " : " + count);
            });
        }finally {
            if (entityManager !=null){
                entityManager.close();
            }
        }
    }

    //ordered dy
    private static void showProductPriceAscOrDesc(){
        EntityManagerFactory entityManagerFactory = null;
        TypedQuery<Double> allProductQuery = null;
        EntityManager entityManager = null;
        List<Double> productPrice = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            allProductQuery = entityManager.createQuery("select p.price from Product p order by p.price asc ", Double.class);

            productPrice = allProductQuery.getResultList();
            System.out.println(productPrice);

            productPrice.forEach(System.out::println);
        }finally {
            if (entityManager !=null){
                entityManager.close();
            }
        }
    }


    private static void showBasicProductInfoByCategory(String category){
        EntityManagerFactory entityManagerFactory = null;
        TypedQuery<BasicProduct> allProductQuery = null;
        EntityManager entityManager = null;
        List<BasicProduct> products = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            allProductQuery = entityManager.createQuery("select new com.jpql.entities.BasicProduct(p.productNo, p.productName, p.price) from Product p where p.category like :category", BasicProduct.class);
            allProductQuery.setParameter("category", category);

            products = allProductQuery.getResultList();

            products.forEach(System.out::println);
        }finally {
            if (entityManager !=null){
                entityManager.close();
            }
        }
    }

    private static void showProductsByManufacturerEstablishedDate(LocalDate date){
        EntityManagerFactory entityManagerFactory = null;
        TypedQuery<Product> allProductQuery = null;
        EntityManager entityManager = null;
        List<Product> products = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            allProductQuery = entityManager.createQuery("select p from Product p where p.manufacturer.establishedDate < :date order by p.productNo", Product.class);
            allProductQuery.setParameter("date", date);

            products = allProductQuery.getResultList();

            products.forEach(System.out::println);
        }finally {
            if (entityManager !=null){
                entityManager.close();
            }
        }
    }

    private static void showManufacturersWhereProductPriceGreater(double price){
        EntityManagerFactory entityManagerFactory = null;
        TypedQuery<Manufacturer> allManufacturerQuery = null;
        EntityManager entityManager = null;
        List<Manufacturer> manufacturers = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            allManufacturerQuery = entityManager.createQuery("select m from Manufacturer m inner join m.products p where p.price > :price", Manufacturer.class);
            allManufacturerQuery.setParameter("price", price);

            manufacturers = allManufacturerQuery.getResultList();

            manufacturers.forEach(System.out::println);
        }finally {
            if (entityManager !=null){
                entityManager.close();
            }
        }
    }

    private static void showCountOfProductByManufacturer(String manufacturerName){
        EntityManagerFactory entityManagerFactory = null;
        TypedQuery<Integer> countOfProductQuery = null;
        EntityManager entityManager = null;
        List<Integer> countOfProducts = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
           //allManufacturerQuery = entityManager.createQuery("select count(p) from Product p where p.manufacturer.businessName = :manufacturerName", Long.class); //OR
            countOfProductQuery = entityManager.createQuery("select size(m.products) from Manufacturer m where m.businessName like :manufacturerName", Integer.class);
            countOfProductQuery.setParameter("manufacturerName", manufacturerName);

            countOfProducts = countOfProductQuery.getResultList();

            countOfProducts.forEach(System.out::println);
        }finally {
            if (entityManager !=null){
                entityManager.close();
            }
        }
    }

    private static void showManufacturerAtLeastProducts(int nProducts){
        EntityManagerFactory entityManagerFactory = null;
        TypedQuery<Manufacturer> allManufacturerQuery = null;
        EntityManager entityManager = null;
        List<Manufacturer> allManufacturer = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            allManufacturerQuery = entityManager.createQuery("from Manufacturer m where size(m.products) >= :nProducts", Manufacturer.class);
            allManufacturerQuery.setParameter("nProducts", nProducts);

            allManufacturer = allManufacturerQuery.getResultList();

            allManufacturer.forEach(System.out::println);
        }finally {
            if (entityManager !=null){
                entityManager.close();
            }
        }
    }

    //sub-query
    private static void showProductForGivenManufacturerName(String manufacturerName){
        EntityManagerFactory entityManagerFactory = null;
        TypedQuery<Product> allProductsQuery = null;
        EntityManager entityManager = null;
        List<Product> allProducts = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            allProductsQuery = entityManager.createQuery
                    ("select p from Product p where p.manufacturer = (select m from Manufacturer m where m.businessName = :manufacturerName)", Product.class);
            allProductsQuery.setParameter("manufacturerName", manufacturerName);

            allProducts = allProductsQuery.getResultList();

            allProducts.forEach(System.out::println);
        }finally {
            if (entityManager !=null){
                entityManager.close();
            }
        }
    }
}
