package com.msf.dao;

import com.msf.entities.Book;
import com.msf.helper.SessionFactoryRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BookDao {
    public Book getBook(int bookNo){
        SessionFactory sessionFactory = null;
        Session session = null;
        Book book = null;

        try{
            sessionFactory = SessionFactoryRegistry.getSessionFactory("book");
            session = sessionFactory.openSession();
            book = session.get(Book.class, bookNo);
        }finally {
            if(session!=null){
                session.close();
            }
        }
        return  book;
    }
}
