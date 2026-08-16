package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class LoggingAspect {

    @Around("execution(* com.aa.beans.Calculator.*(..))")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object ret = null;
        Signature signature = null;
        Object[] args = null;
        Object target = null;

        signature = proceedingJoinPoint.getSignature();
        args = proceedingJoinPoint.getArgs();
        target = proceedingJoinPoint.getTarget();

        System.out.print("entered into "+ signature.getName() + "(");
        for (int i =0; i<args.length; i++){
            if(i==0){
                System.out.print(args[i]);
                continue;
            }
            System.out.print(", "+args[i]);
        }
        System.out.println(")");

        ret = proceedingJoinPoint.proceed();

        System.out.println("exiting from "+ signature.getName()+ " with ret : "+ret);

        return ret;
    }
}
