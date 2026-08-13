package com.mba.advice;

import com.mba.helper.SecurityManager;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class AuditAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {

        //audit
        SecurityManager manager = SecurityManager.getInstance();
        String user = manager.getLoggedInUser();
        System.out.println(user +" is accessing the : " + target.getClass().getName() + "." +method.getName()+"("+args[0]+")");
    }
}
