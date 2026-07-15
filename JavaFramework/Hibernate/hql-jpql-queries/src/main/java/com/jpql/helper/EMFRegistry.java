package com.jpql.helper;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMFRegistry {
    private static final EntityManagerFactory entityManagerFactory;

    static {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("jpqlpu");
        }catch (Throwable t){
            t.printStackTrace();
            throw t;
        }
    }

    public static EntityManagerFactory getEntityManagerFactory(){
        return entityManagerFactory;
    }

    public static void closeEntityManagerFactory(){
        if (entityManagerFactory !=null && entityManagerFactory.isOpen()){
            entityManagerFactory.close();
        }
    }
}
