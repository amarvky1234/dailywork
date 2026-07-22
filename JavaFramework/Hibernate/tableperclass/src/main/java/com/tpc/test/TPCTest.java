package com.tpc.test;

import com.tpc.dao.ProductDao;
import com.tpc.entities.Product;
import com.tpc.entities.Shoe;
import com.tpc.entities.Wallet;
import com.tpc.helper.EMFRegistry;

public class TPCTest {
    public static void main(String[] args) {
        try {
            ProductDao productDao = new ProductDao();
            /*Shoe shoe = Shoe.of().productName("Pointed Leather Shoe")
                    .description("black leather shoe")
                    .price(3500)
                    .size(9)
                    .soleType("rubber")
                    .purpose("office").build();
            int id = productDao.saveProduct(shoe);*/

            /*Wallet wallet = Wallet.of().productName("Mens wallet")
                    .description("black leather wallet")
                    .price(3100)
                    .walletType("General")
                    .sections(2)
                    .material("leather").build();
            int id = productDao.saveProduct(wallet);
            System.out.println("id : "+id);*/

            /*Shoe shoe = productDao.findShoe(1);
            System.out.println(shoe);*/

            Product product = productDao.findProduct(2);
            System.out.println(product);
        }finally {
            EMFRegistry.closeEntityManagerFactory();
        }
    }
}
