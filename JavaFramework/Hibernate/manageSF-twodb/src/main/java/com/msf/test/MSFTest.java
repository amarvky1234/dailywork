package com.msf.test;

import com.msf.dao.AddressDao;
import com.msf.dao.BookDao;
import com.msf.dao.ProductsDao;
import com.msf.entities.Address;
import com.msf.entities.Book;
import com.msf.entities.Products;
import com.msf.helper.SessionFactoryRegistry;

public class MSFTest {
    public static void main(String[] args) {
        Book book = null;
        BookDao bookDao = null;
        Address address = null;
        AddressDao addressDao = null;

        bookDao = new BookDao();
        book = bookDao.getBook(1);
        System.out.println(book);

       addressDao = new AddressDao();
       address = addressDao.getAddress(1);
       System.out.println(address);

       SessionFactoryRegistry.closedSessionFactory("book");
       SessionFactoryRegistry.closedSessionFactory("address");
    }
}
