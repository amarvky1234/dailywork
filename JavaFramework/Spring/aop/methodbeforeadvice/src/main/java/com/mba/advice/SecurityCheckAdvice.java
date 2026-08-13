package com.mba.advice;

import com.mba.helper.SecurityManager;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SecurityCheckAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        SecurityManager securityManager = SecurityManager.getInstance();

        if (securityManager.authentication() == false){
            throw new IllegalAccessException("un/pwd is false");
        }
    }
}
