package com.st.test;

import com.st.dao.PaymentDao;
import com.st.entities.CardPayment;
import com.st.entities.ChequePayment;
import com.st.entities.Payment;
import com.st.helper.EMFRegistry;

import java.time.LocalDate;

public class SingleTableTest {
    public static void main(String[] args) {

        try {
            PaymentDao paymentDao = new PaymentDao();
            /*Payment payment = new Payment();

            payment.setBillNo("bn010");
            payment.setPaymentDate(LocalDate.now());
            payment.setDescription("groceries");
            payment.setAmount(2300);
            payment.setPaymentStatus("paid");*/

            /*CardPayment payment = new CardPayment();
            payment.setBillNo("bn020");
            payment.setPaymentDate(LocalDate.now());
            payment.setDescription("groceries");
            payment.setAmount(2300);
            payment.setPaymentStatus("paid");
            payment.setIssuer("visa");
            payment.setCardNumber("4567-2345-3456-9878");
            payment.setCardType("credit");
            payment.setExpiry("10/25");*/

            /*ChequePayment payment = new ChequePayment();
            payment.setBillNo("bn030");
            payment.setPaymentDate(LocalDate.now());
            payment.setDescription("utensils");
            payment.setAmount(4300);
            payment.setPaymentStatus("paid");
            payment.setChequeNo("CHQ4567");
            payment.setBankName("SBI");
            payment.setChequeDate(LocalDate.now().plusDays(2));
            payment.setPayeeAccountNo("SBI098456");
            payment.setPayeeName("Radha Enterprise");

            int id = paymentDao.savePayment(payment);
            System.out.println("payment id : " + id);*/

            /*ChequePayment chequePayment = paymentDao.findChequePayment(2);
            System.out.println(chequePayment);*/

            Payment payment = paymentDao.findPayment(3);
            System.out.println(payment);
        }finally {
            EMFRegistry.closeEntityManagerFactory();
        }
    }
}
