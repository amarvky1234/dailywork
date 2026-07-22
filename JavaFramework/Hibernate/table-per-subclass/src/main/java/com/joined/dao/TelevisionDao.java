package com.joined.dao;

import com.joined.entities.LCDTelevision;
import com.joined.entities.LEDTelevision;
import com.joined.entities.Television;
import com.joined.helper.EMFRegistry;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class TelevisionDao {
    public int saveTelevision(Television television){
        EntityManagerFactory entityManagerFactory = EMFRegistry.getEntityManagerFactory();
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        boolean flag = false;

        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(television);

            flag = true;

        }finally {
            if (entityTransaction!=null){
                if(flag){
                    entityTransaction.commit();
                }else{
                    entityTransaction.rollback();
                }
                entityManager.close();
            }
        }
        return television.getTelevisionProductCode();
    }

    public Television findTelevision(int televisionProductCode){
        EntityManagerFactory entityManagerFactory = EMFRegistry.getEntityManagerFactory();
        EntityManager entityManager = null;
        Television television = null;

        try {
            entityManager = entityManagerFactory.createEntityManager();
            television = entityManager.find(Television.class, televisionProductCode);

        }finally {
            if(entityManager !=null){
                entityManager.close();
            }
        }
        return television;
    }
}

