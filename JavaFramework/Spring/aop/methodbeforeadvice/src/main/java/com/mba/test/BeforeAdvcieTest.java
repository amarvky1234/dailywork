package com.mba.test;

import com.mba.advice.AuditAdvice;
import com.mba.advice.SecurityCheckAdvice;
import com.mba.beans.LoanManager;
import com.mba.helper.SecurityManager;
import org.springframework.aop.framework.ProxyFactory;

public class BeforeAdvcieTest {
    public static void main(String[] args) {
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(new LoanManager());

        //the order in which we added the advices in the same order those are applied on target class method
        pf.addAdvice(new AuditAdvice());
        pf.addAdvice(new SecurityCheckAdvice());

        LoanManager proxy = (LoanManager) pf.getProxy();

        SecurityManager manager = SecurityManager.getInstance();
        manager.login("John", "aop@1");

        boolean status = proxy.approveLoan("L736844");
        System.out.println("loanApproved status? : " +status);
    }
}
