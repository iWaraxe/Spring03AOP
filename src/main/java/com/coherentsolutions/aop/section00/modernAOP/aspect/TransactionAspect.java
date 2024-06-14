package com.coherentsolutions.aop.section00.modernAOP.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionAspect {

    @Around("execution(* com.coherentsolutions.aop.section00.modernAOP.service.*.*(..))")
    public Object manageTransaction(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Starting transaction for method: " + joinPoint.getSignature().getName());
        Object result;
        try {
            result = joinPoint.proceed();
            System.out.println("Committing transaction for method: " + joinPoint.getSignature().getName());
        } catch (Throwable throwable) {
            System.out.println("Rolling back transaction for method: " + joinPoint.getSignature().getName());
            throw throwable;
        }
        return result;
    }
}
