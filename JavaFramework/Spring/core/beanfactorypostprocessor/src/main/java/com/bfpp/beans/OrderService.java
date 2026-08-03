package com.bfpp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {
    @Autowired
    private PaymentService paymentService;

    public void checkout(List<String> items){

        String transRef = paymentService.pay("m1", "c1", 300, "online transaction");
        System.out.println("transaction ref : " + transRef);
    }
}
