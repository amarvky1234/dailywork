package com.getvsload.test;


import com.getvsload.entities.Customer;
import com.getvsload.entities.ICustomer;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetVsLoad {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            //eagerVsLazy(session);
            //noRecordExists(session);
            //safeOperation(session);
            //activeSessionReq(session);
            defaulToLazyButCanTurnOff(session);
        }finally {
            if(session!=null){
                session.close();
            }
            if(sessionFactory!=null){
                sessionFactory.close();
            }
        }
    }
    private static void eagerVsLazy(Session session) {
        /*Customer customer = session.get(Customer.class,1);
        System.out.println(customer.getClass().getCanonicalName());*/
        Customer customer = session.load(Customer.class,1);
        System.out.println("load return porxy, now about to access the data using proxy below");
        System.out.println(customer.getFullname());
        System.out.println("Customer Class Type:"+ customer.getClass().getCanonicalName());
    }

    private  static void noRecordExists(Session session) {
        Customer customer = session.get(Customer.class, 2); //there is no record exist for customer_no=2
        System.out.println(customer);

        Customer customer1 = session.load(Customer.class, 2);
        if (customer1 !=null) {
            System.out.println("object found");
        }else {
            System.out.println("object not found");
        }
        //System.out.println(customer1.getFullname());
    }

    private static void safeOperation(Session session) {
        Customer customer = session.get(Customer.class, 2);
        if (customer !=null){
            System.out.println(customer.getFullname());
        }else {
            System.out.println("no customer found for customerNo : 2");
        }

        try {
            Customer customer1 = session.load(Customer.class, 2);
            System.out.println(customer1.getFullname());
        }catch (ObjectNotFoundException e){
            System.out.println("no customer found for customerNo : 2");
        }

    }

    private static void activeSessionReq(Session session){
        //Customer customer1 = session.get(Customer.class, 1);
        Customer customer2 = session.load(Customer.class, 1);

        session.close();
        System.out.println("session is closed");
        //System.out.println("access the data from get(..) retured customer1 obj : "+customer1.getFullname());
        System.out.println("access the dat from load(..) retured customer2 obj :"+customer2.getFullname());
    }

    private static void defaulToLazyButCanTurnOff(Session session){
        Customer customer = session.load(Customer.class, 1);
        System.out.println(customer);
    }

    private static void useOfFinalTurnsOfLazyLoding(Session session){
        //ICustomer customer = session.load(Customer.class, 1);
        //System.out.println(customer);
    }

}
