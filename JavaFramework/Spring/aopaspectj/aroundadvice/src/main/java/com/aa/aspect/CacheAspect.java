package com.aa.aspect;

import com.aa.helper.Cache;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class CacheAspect {
    @Autowired
    private Cache cache;

    @Around("execution(* com.aa.beans.Calculator.*(..))")
    public Object applyCache(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object ret = null;
        Signature signature = null;
        Object[] args = null;
        Object target = null;
        String key = null;

        signature = proceedingJoinPoint.getSignature();
        args = proceedingJoinPoint.getArgs();

        key = signature.getName() + "(";
        for (int i = 0; i< args.length; i++){
            if (i==0){
                key+= args[i];
                continue;
            }
            key+= ", "+ args[i];
        }
        key+= ")";

        if (cache.containsKey(key)){
            return cache.get(key);
        }

        ret = proceedingJoinPoint.proceed();
        cache.put(key, ret);

        return ret;
    }
}
