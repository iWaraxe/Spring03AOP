package com.coherentsolutions.aop.section07.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.coherentsolutions.aop.section07.service.*.*(..))")
    public void logMethodCall(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] methodArgs = joinPoint.getArgs();
        System.out.println("Method " + methodName + " called with arguments " + Arrays.toString(methodArgs));
    }

    @Before("execution(* com.coherentsolutions.aop.section07.service.*.*(..)) && args(accountId,..)")
    public void logAccountAccess(JoinPoint joinPoint, Long accountId) {
        System.out.println("Accessing account with ID: " + accountId);
    }
}
