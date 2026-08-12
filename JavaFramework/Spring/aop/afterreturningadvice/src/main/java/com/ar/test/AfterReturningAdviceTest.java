package com.ar.test;

import com.ar.advice.PromotionsAdvice;
import com.ar.beans.BillManager;
import org.springframework.aop.framework.ProxyFactory;

import java.util.Arrays;

public class AfterReturningAdviceTest {
    public static void main(String[] args) {
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(new BillManager());
        pf.addAdvice(new PromotionsAdvice());

        BillManager proxy = (BillManager) pf.getProxy();
        double amount = proxy.generalBill(Arrays.asList(new String[]{"p923487", "p9824473"}));

        System.out.println("bill amount : "+ amount);
    }
}
