package com.eh.service;

import com.eh.exception.InsufficientFundException;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {

    public String processPayment(double amount){
        if (amount > 5000){
            throw new InsufficientFundException("Insufficient Fund");
        }
        return UUID.randomUUID().toString().substring(1, 9);
    }

}
