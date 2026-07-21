package com.st.dao;

import com.st.entities.CardPayment;
import com.st.helper.EMFRegistry;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class CardPaymentDao {
    public int savePayment(CardPayment payment){
        EntityManagerFactory entityManagerFactory = EMFRegistry.getEntityManagerFactory();
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        boolean flag = false;

        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(payment);

            flag = true;
        }finally {
            if (entityTransaction!=null){
                if (flag){
                    entityTransaction.commit();
                }else {
                    entityTransaction.rollback();
                }
                entityManager.close();
            }
        }
        return payment.getId();
    }
}
