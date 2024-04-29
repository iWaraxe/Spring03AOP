package com.coherentsolutions.aop.section06.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class SecurityAspect {

    @Before("execution(* com.coherentsolutions.aop.section06.service.MyService.*(..))")
    public void checkSecurity() {
        System.out.println("Performing security check...");
    }
}
