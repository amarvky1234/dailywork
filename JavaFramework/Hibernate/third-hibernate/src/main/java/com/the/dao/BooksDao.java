package com.the.dao;

import com.the.entitites.Books;
import com.the.helper.SessionFactoryRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BooksDao {
    public Books getBooks(int bookNo){
        SessionFactory sessionFactory = null;
        Session session = null;
        Books books = null;

        sessionFactory = SessionFactoryRegistry.getRegistry();
        session = sessionFactory.openSession();
        books = session.get(Books.class, bookNo);

        if(session!=null){
            session.close();
        }
        return books;
    }
}
