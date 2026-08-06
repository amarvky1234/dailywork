package com.don.test;

import com.don.beans.LoanCalculatorService;
import com.don.config.DONConfigClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class DONTest {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(DONConfigClass.class);
        LoanCalculatorService loanCalculatorService = context.getBean(LoanCalculatorService.class);

        double interestAmount = loanCalculatorService.calculateInterestAmount(100000, 2,
                800, "personal", "patna");
        System.out.println("interest to be paid : " + interestAmount);
    }
}
