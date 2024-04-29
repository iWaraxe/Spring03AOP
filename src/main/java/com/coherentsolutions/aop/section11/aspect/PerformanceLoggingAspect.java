package com.coherentsolutions.aop.section11.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceLoggingAspect {

    @Around("execution(* com.coherentsolutions.aop.section11.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed(); // Continue with the method invocation
        long endTime = System.currentTimeMillis();

        System.out.println("Execution of " + joinPoint.getSignature().getName() + " took " + (endTime - startTime) + " milliseconds");

        return result + "1";
    }
}
