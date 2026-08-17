package com.pcd.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    //@Around("execution(* com.pcd.beans.Calculator.*(..))")
    //@Around("within(com.pcd.beans.*)")
    //@Around("target(com.pcd.beans.Calculator)")
    //@Around("this(com.pcd.beans.Calculator)")
    //@Around("bean(scientificCalculator)")
    //@Around("within(com.pcd.beans.*) and not target(com.pcd.beans.Calculator)")
    //@Around("bean(calculator) or bean(multiplyCalculator)")
    @Around("not bean(calculator")
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
