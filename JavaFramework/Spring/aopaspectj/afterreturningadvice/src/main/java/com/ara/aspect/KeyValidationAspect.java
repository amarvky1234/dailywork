package com.ara.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class KeyValidationAspect {

    @AfterReturning(value = "execution(* com.ara.beans.KeyGenerator.*(..))", returning = "ret")
    public void validate(JoinPoint joinPoint, Object ret){
        System.out.println("in Advice");
        int key = (Integer) ret;

        if(key <= 0){
            throw new RuntimeException("weak key generated");
        }
    }
}
