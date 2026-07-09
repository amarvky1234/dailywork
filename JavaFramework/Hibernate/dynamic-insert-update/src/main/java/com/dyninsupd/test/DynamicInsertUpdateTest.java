package com.dyninsupd.test;

import com.dyninsupd.entities.Passenger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DynamicInsertUpdateTest {
    public static void main(String[] args) {

        Configuration configuration = null;
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        boolean flag = false;

        try {
            configuration = new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            //insert operation
            /*Passenger passenger = new Passenger();
            passenger.setFullName("Ajay Kumar");
            passenger.setAge(26);
            passenger.setGender("Male");

            session.persist(passenger);*/

            //update operation
            Passenger passenger = session.get(Passenger.class,1);
            passenger.setFullName("Mukesh Kumar");
            session.merge(passenger);


            flag = true;

        }finally {
            if (transaction != null){
                if(flag){
                    transaction.commit();
                }else {
                    transaction.rollback();
                }
                session.close();
            }
            if (sessionFactory != null){
                sessionFactory.close();
            }
        }
    }
}
