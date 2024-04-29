package com.coherentsolutions.aop.section03.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Pointcut expression targeting all methods in service package that return any type
    @Before("execution(* com.coherentsolutions.aop.section03.service.*.*(..))")
    public void logMethodExecution(JoinPoint joinPoint) {
        System.out.println("Before executing method: " + joinPoint.getSignature().getName());
    }
}
