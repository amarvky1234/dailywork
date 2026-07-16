package com.idgen.test;

import com.idgen.dao.ProductDao;
import com.idgen.entities.Product;
import com.idgen.helper.EntityManagerFactoryRegistry;

public class IDGeneratorTest {
    public static void main(String[] args) {
        Product product = null;
        ProductDao productDao = null;

        try {
            productDao = new ProductDao();
            product = new Product();

            product.setProductName("LED 32INCH TELEVISION");
            product.setManufacturer("LG");
            product.setCategory("Electronics");
            product.setPrice(45000);

            int productNo = productDao.saveProduct(product);
            System.out.println("product has saved with productNo " + productNo);
        }finally {
            EntityManagerFactoryRegistry.colseEntityManagerFactory();
        }
    }
}
