package com.coherentsolutions.aop.section10.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ResourceCleanupAspect {

    @After("execution(* com.coherentsolutions.aop.section10.service.*.*(..))")
    public void cleanupDatabaseConnection() {
        System.out.println("Cleaning up resources after method execution.");
    }
}
