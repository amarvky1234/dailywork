package com.eh.dto;

import lombok.Data;

@Data
public class PayRequest {
    private String billNo;
    private String merchantId;
    private String cardNo;
    private String cardType;
    private int cvv;
    private String expiry;
    private double amount;
    private String remarks;
}
