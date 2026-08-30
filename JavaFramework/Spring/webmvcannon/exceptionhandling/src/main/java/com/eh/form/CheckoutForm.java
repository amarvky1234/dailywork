package com.eh.form;

import lombok.Data;

@Data
public class CheckoutForm {
    private String cardNumber;
    private int expiryMonth;
    private int expiryYear;
    private int cvv;
}
