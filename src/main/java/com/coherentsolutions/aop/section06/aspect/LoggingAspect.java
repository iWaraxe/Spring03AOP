package com.coherentsolutions.aop.section06.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class LoggingAspect {

    @Before("execution(* com.coherentsolutions.aop.section06.service.MyService.*(..))")
    public void logMethodExecution() {
        System.out.println("Logging method execution...");
    }
}
