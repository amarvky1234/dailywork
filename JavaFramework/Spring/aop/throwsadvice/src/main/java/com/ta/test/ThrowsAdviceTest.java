package com.ta.test;

import com.ta.advice.ExceptionLoggingAdvice;
import com.ta.beans.Thrower;
import org.springframework.aop.framework.ProxyFactory;

public class ThrowsAdviceTest {
    public static void main(String[] args) {
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(new Thrower());
        pf.addAdvice(new ExceptionLoggingAdvice());

        Thrower proxy = (Thrower) pf.getProxy();
        int i = proxy.willThrow(-10);
        System.out.println("i : " + i);
    }
}
