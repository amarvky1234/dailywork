package com.mba.beans;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class LoanManager {
    public boolean approvedLoan(String loanNo){

        System.out.println("evaluating the loanNo : "+ loanNo +" for processing");

        return new SecureRandom().nextBoolean();
    }
}
