package com.hba.helper;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {
    private final static SessionFactory sessionFactory;

    static {
        try {
            Configuration configuration = new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    public static void closedSessionFactory(){
        if(sessionFactory !=null && sessionFactory.isOpen()){
            sessionFactory.close();
        }
    }
}
