package com.the.test;

import com.the.dao.BooksDao;
import com.the.dao.ProductsDao;
import com.the.entitites.Books;
import com.the.entitites.Products;
import com.the.helper.SessionFactoryRegistry;

public class THETest {
    public static void main(String[] args) {
        Books books = null;
        BooksDao booksDao = null;
        Products products = null;
        ProductsDao productsDao = null;

        booksDao = new BooksDao();
        books = booksDao.getBooks(1);
        System.out.println(books);

        productsDao = new ProductsDao();
        products = productsDao.getProducts(1);
        System.out.println(products);

       SessionFactoryRegistry.closeSessionFactory();
    }
}
