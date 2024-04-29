package com.coherentsolutions.aop.section10.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodExitLoggingAspect {

    @After("execution(* com.coherentsolutions.aop.section10.service.*.*(..))")
    public void logMethodExit() {
        System.out.println("Method has completed execution.");
    }
}
