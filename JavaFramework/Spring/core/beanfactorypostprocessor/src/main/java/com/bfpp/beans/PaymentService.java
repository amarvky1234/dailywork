package com.bfpp.beans;

public interface PaymentService {
    String pay(String merchantId, String customerId, double amount, String remarks);
}
