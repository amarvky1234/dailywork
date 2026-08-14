package com.ta.advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class ExceptionLoggingAdvice implements ThrowsAdvice {

    /*public void afterThrowing(IllegalArgumentException e){
        System.out.println("exception has been thrown with message : " + e.getMessage());
    }*/

    public void afterThrowing(Exception e){
        System.out.println("exception thrown with message : " + e.getMessage());
    }

    /*public void afterThrowing(Method method, Object[] args, Object target, IllegalArgumentException e){
        System.out.println("exception thrown by : " + method.getName()+"("+args[0]+") with message : " + e.getMessage());
    }*/
}
