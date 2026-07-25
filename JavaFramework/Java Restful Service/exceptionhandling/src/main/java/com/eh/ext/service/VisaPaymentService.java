package com.eh.ext.service;

import com.eh.dto.PayRequest;
import com.eh.exception.CVVMismatchException;

import java.util.UUID;

public class VisaPaymentService {
    public String processPayment(PayRequest payRequest){
        if (payRequest.getCvv() != 100){
            throw new CVVMismatchException("cvv is not valid");
        }
        return UUID.randomUUID().toString().substring(1,12);
    }
}
