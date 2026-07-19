package com.msf.test;

import com.msf.dao.BooksDao;
import com.msf.entities.Books;
import com.msf.helper.SessionFactoryRegistry;

public class MSFTest {
    public static void main(String[] args) {
        Books book = null;
        BooksDao booksDao = null;

        booksDao = new BooksDao();
        book = booksDao.getBook(5);
        System.out.println(book);

        SessionFactoryRegistry.closedSessionFactory();
    }
}
