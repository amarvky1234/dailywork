package com.bfpp.beans;

import java.util.UUID;

public class ZellePaymentService implements PaymentService{
    @Override
    public String pay(String merchantId, String customerId, double amount, String remarks) {
        return "ZEL_" + UUID.randomUUID().toString();
    }
}
