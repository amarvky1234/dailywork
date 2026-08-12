package com.ar.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class PromotionsAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        double amt = (double) returnValue;

        if (amt >= 10000){
            System.out.println("Congratulations! you earn 20% discount on your next purchase, here is the coupon: c20");
        } else if (amt >= 7000 && amt<10000) {
            System.out.println("Congratulations! you earn 12% discount on your next purchase, here is the coupon: c12");
        } else if (amt >= 5000 && amt<7000) {
            System.out.println("Congratulations! you earn 8% discount on your next purchase, here is the coupon: c8");
        }
    }
}
