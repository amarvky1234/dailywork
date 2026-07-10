package com.flc.test;

import com.flc.entities.Trip;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FLCTest {
    public static void main(String[] args) {
        Configuration configuration = null;
        SessionFactory sessionFactory = null;

        try {
            configuration = new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();

            //showTrip(sessionFactory);
            updateTrip(sessionFactory);

        }finally {
            if (sessionFactory != null){
                sessionFactory.close();
            }
        }
    }

    //dql
    private static void showTrip(SessionFactory sessionFactory){
        Session session1 = sessionFactory.openSession();
        Trip trip1 = session1.find(Trip.class,1);

        Trip trip2 = session1.find(Trip.class, 1);

        System.out.println("(trip1 == trip2)? : " + (trip1 == trip2));
        System.out.println(trip1.hashCode());
        System.out.println(trip2.hashCode());
        session1.close();
        System.out.println("after closing session1");

        Session session2 = sessionFactory.openSession();
        Trip trip3 = session2.get(Trip.class, 1);
        System.out.println("(trip1 == trip3)? : " + (trip1 == trip3));
        System.out.println(trip3.hashCode());
    }

    //dml
    private static void updateTrip(SessionFactory sessionFactory){
        Session session = null;
        Transaction transaction = null;
        boolean flag = false;

        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            Trip trip = session.find(Trip.class, 1);
            trip.setSource("delhi");
            session.merge(trip); //writes to cache

            trip.setDestination("Manali");
            session.merge(trip);

            flag = true;
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
