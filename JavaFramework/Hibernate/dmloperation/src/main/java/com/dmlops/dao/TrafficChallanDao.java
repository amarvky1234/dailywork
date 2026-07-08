package com.dmlops.dao;

import com.dmlops.entities.TrafficChallan;
import com.dmlops.helper.SessionFactoryRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TrafficChallanDao {

    public int saveTrafficChallan(TrafficChallan trafficChallan){
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        boolean flag = true;
        int challanNo = 0;

        try{
            sessionFactory = SessionFactoryRegistry.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            challanNo = (Integer) session.save(trafficChallan);
            System.out.println("from entity challanNo : " + trafficChallan.getChallanNo());
            flag=true;
        }finally {
            if(transaction != null){
                if(flag){
                    transaction.commit();
                }else {
                    transaction.rollback();
                }
                session.close();
            }
        }
        return challanNo;
    }

    public void persistTrafficChallan(TrafficChallan trafficChallan){
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        boolean flag = true;


        try{
            sessionFactory = SessionFactoryRegistry.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.persist(trafficChallan);
            System.out.println("from entity challanNo : " + trafficChallan.getChallanNo());
            flag=true;
        }finally {
            if(transaction != null){
                if(flag){
                    transaction.commit();
                }else {
                    transaction.rollback();
                }
                session.close();
            }
        }
    }
    public void updateTrafficChallan(TrafficChallan trafficChallan){
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        boolean flag = true;

        try{
            sessionFactory = SessionFactoryRegistry.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.update(trafficChallan);
            flag=true;
        }finally {
            if(transaction != null){
                if(flag){
                    transaction.commit();
                }else {
                    transaction.rollback();
                }
                session.close();
            }
        }
    }
    public void updateTrafficChallan(int challanNo, String reasonForChallan, double amount){
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        TrafficChallan trafficChallan = null;
        boolean flag = true;

        try{
            sessionFactory = SessionFactoryRegistry.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            trafficChallan = session.get(TrafficChallan.class, challanNo);
            trafficChallan.setReasonForChallan(reasonForChallan);
            trafficChallan.setAmount(amount);

            session.merge(trafficChallan);

            flag=true;
        }finally {
            if(transaction != null){
                if(flag){
                    transaction.commit();
                }else {
                    transaction.rollback();
                }
                session.close();
            }
        }
    }
}
