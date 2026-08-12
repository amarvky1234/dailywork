package com.aad.test;

import com.aad.advice.LoggingAdvice;
import com.aad.beans.Calculator;
import org.springframework.aop.framework.ProxyFactory;

public class LoggingAdviceTest {
    public static void main(String[] args) {

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(new Calculator());
        pf.addAdvice(new LoggingAdvice());

        Calculator proxy = (Calculator) pf.getProxy();
        int sum = proxy.add(100, 200);
        System.out.println("sum : " +sum);
    }
}
