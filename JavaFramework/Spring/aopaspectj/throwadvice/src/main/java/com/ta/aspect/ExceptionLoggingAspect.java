package com.ta.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExceptionLoggingAspect {

    @AfterThrowing(value = "execution(* com.ta.beans.*.*(..))", throwing = "iae")
    public void logException(JoinPoint joinPoint, IllegalArgumentException iae){
        System.out.println(joinPoint.getSignature().getName()+ " has thrown exception with message : " + iae.getMessage());
    }
}
