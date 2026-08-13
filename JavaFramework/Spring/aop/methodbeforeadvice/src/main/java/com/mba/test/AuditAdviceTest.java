package com.mba.test;

import com.mba.advice.AuditAdvice;
import com.mba.beans.LoanManager;
import org.springframework.aop.framework.ProxyFactory;

public class AuditAdviceTest {
    public static void main(String[] args) {
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(new LoanManager());
        pf.addAdvice(new AuditAdvice());

        LoanManager proxy = (LoanManager) pf.getProxy();
        boolean approveLoan = proxy.approveLoan("LYR773838");
        System.out.println("loan approved? : "+approveLoan);
    }
}
