package com.mba.aspect;

import com.mba.helper.SecurityManager;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityAspect {
    @Autowired
    private SecurityManager securityManager;

    @Before("execution(* com.mba.beans.LoanManager.*(..))")
    public void audit(JoinPoint jp){
        final Signature signature = jp.getSignature();
        final Object[] args = jp.getArgs();

        System.out.print(securityManager.logName()+" has called "+ signature.getName() +"(");
        for (int i=0; i<args.length; i++){
            if (i==0){
                System.out.print(args[i]);
                continue;
            }
            System.out.print(", "+args[i]);
        }
        System.out.println(")");
    }

    @Before("execution(* com.mba.beans.LoanManager.*(..))")
    public void authenticate(JoinPoint jp){
        if(securityManager.authenticate() == false){
            throw new IllegalStateException("invalid un/pwd");
        }
    }
}
