package com.msf.dao;

import com.msf.entities.Address;
import com.msf.helper.SessionFactoryRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AddressDao {
    public Address getAddress(int addressNo) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Address address = null;

        try{
           sessionFactory = SessionFactoryRegistry.getSessionFactory("address") ;
           session = sessionFactory.openSession();
           address =session.get(Address.class, addressNo);
        }finally {
            if(session!=null){
                session.close();
            }
        }
        return address;
    }
}
