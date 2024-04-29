package com.coherentsolutions.aop.section12.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExceptionHandlingAspect {

    @Around("execution(* com.coherentsolutions.aop.section12.service.*.*(..))")
    public Object handleExceptions(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            return joinPoint.proceed();
        } catch (Exception ex) {
            System.out.println("Exception caught in " + joinPoint.getSignature().getName() + ": " + ex.getMessage());
            throw ex; // Rethrow the caught exception
        }
    }

    @Around("execution(* com.coherentsolutions.aop.section12.service.*.*(..))")
    public Object modifyExceptions(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            return joinPoint.proceed();
        } catch (Exception ex) {
            throw new CustomException("Custom message plus original message: " + ex.getMessage(), ex);
        }
    }
}
