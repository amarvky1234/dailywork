package com.bfpp.beans;

import java.util.UUID;

public class RazorPaymentService implements PaymentService{
    @Override
    public String pay(String merchantId, String customerId, double amount, String remarks) {
        return "RZR_" + UUID.randomUUID().toString();
    }
}
