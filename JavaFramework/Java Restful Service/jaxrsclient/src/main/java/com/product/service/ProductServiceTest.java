package com.product.service;

public class ProductServiceTest {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        String productDetails = service.searchProduct("HomeAppliance", "Bajaj", "BYt838", "Black");
        System.out.println("ProductDetails ->"+productDetails);
    }
}
