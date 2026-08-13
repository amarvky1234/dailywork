package com.mba.test;

import com.mba.advice.SecurityCheckAdvice;
import com.mba.beans.LoanManager;
import com.mba.helper.SecurityManager;
import org.springframework.aop.framework.ProxyFactory;

public class SecurityCheckAdviceTest {
    public static void main(String[] args) {
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(new LoanManager());
        pf.addAdvice(new SecurityCheckAdvice());

        LoanManager proxy = (LoanManager) pf.getProxy();

        SecurityManager securityManager = SecurityManager.getInstance();
        securityManager.login("John", "aop@1");

        boolean status = proxy.approveLoan("SD734483");
        System.out.println("loanApproved status ? : " + status);

    }
}
