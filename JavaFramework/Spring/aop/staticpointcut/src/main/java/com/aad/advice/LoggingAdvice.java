package com.aad.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class LoggingAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Method method = invocation.getMethod();
        Object[] args = invocation.getArguments();

        System.out.println("entered into "+ method.getName() +"("+args[0]+", "+args[1]+ ") ");

        Object ret = invocation.proceed();

        System.out.println("existing from "+ method.getName()+ " with return value : " +ret);

        return ret;
    }
}
