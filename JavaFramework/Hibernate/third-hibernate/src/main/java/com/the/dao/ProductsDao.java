package com.the.dao;

import com.the.entitites.Products;
import com.the.helper.SessionFactoryRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ProductsDao {
    public Products getProducts(int productNo) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Products products = null;

        try{
            sessionFactory = SessionFactoryRegistry.getRegistry();
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
