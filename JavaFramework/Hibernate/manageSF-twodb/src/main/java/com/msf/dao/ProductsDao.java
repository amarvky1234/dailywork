package com.msf.dao;

import com.msf.entities.Book;
import com.msf.entities.Products;
import com.msf.helper.SessionFactoryRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ProductsDao {
    public Products getProducts(int productNo) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Products products = null;

        try{
            sessionFactory = SessionFactoryRegistry.getSessionFactory("products");
            session = sessionFactory.openSession();
            products = session.get(Products.class, productNo);
        }finally {
            if(session!=null){
                session.close();
            }
        }

        return products;
    }
}
