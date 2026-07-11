package com.getvsload.test;

import com.getvsload.entities.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestActiveSession {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Customer customer = session.load(Customer.class, 1);
        session.close();
        System.out.println(customer.getFullname());
    }
}
