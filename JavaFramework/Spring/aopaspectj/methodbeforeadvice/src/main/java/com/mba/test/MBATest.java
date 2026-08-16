package com.mba.test;

import com.mba.beans.LoanManager;
import com.mba.config.BeforeAdviceConfig;
import com.mba.helper.SecurityManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MBATest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeforeAdviceConfig.class);
        LoanManager loanManager = context.getBean("loanManager", LoanManager.class);
        SecurityManager securityManager = context.getBean(SecurityManager.class);
        securityManager.login("fedrick", "abc");

        boolean loanStatus = loanManager.approvedLoan("UT83738");
        System.out.println("Loan Status : "+loanStatus);
        securityManager.logout();
    }
}
