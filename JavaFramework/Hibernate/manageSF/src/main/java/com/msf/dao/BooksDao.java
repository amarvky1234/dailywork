package com.msf.dao;

import com.msf.entities.Books;
import com.msf.helper.SessionFactoryRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BooksDao {
    public Books getBook(int isbnNo) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Books book = null;

        try {
            sessionFactory = SessionFactoryRegistry.getSessionFactory();
            session = sessionFactory.openSession();
            book = session.get(Books.class, isbnNo);
        }finally {
            if(session !=null){
                session.close();
            }
        }
    return book;
    }
}
