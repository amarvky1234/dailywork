package com.the.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {
    private static SessionFactory registry;

    static {
        Configuration configuration = new Configuration().configure();
        registry = configuration.buildSessionFactory();
    }

    public static SessionFactory getRegistry() {
        return registry;
    }

    public static void closeSessionFactory(){
        if(registry!=null && registry.isOpen()){
            registry.close();
        }
    }
}
