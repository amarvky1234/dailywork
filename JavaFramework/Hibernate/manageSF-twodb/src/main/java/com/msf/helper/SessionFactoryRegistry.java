package com.msf.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.HashMap;
import java.util.Map;

public class SessionFactoryRegistry {
    private static Map<String, SessionFactory> registry = new HashMap<>();

    static {
        Configuration bookConfiguration = new Configuration().configure("book-hibernate.cfg.xml");
        SessionFactory bookSessionFactory = bookConfiguration.buildSessionFactory();

        registry.put("book", bookSessionFactory);

        Configuration addressConfiguration = new Configuration().configure("address-hibernate.cfg.xml");
        SessionFactory addressSessionFactory = addressConfiguration.buildSessionFactory();


        registry.put("address", addressSessionFactory);
    }

    public static SessionFactory getSessionFactory(String key){
        return registry.get(key);
    }

    public static void closedSessionFactory(String key){
        if (registry.get(key)!=null) {
            SessionFactory sessionFactory = registry.get(key);
            if(sessionFactory.isOpen()){
                sessionFactory.close();
                registry.remove(key);
            }
        }
    }
}