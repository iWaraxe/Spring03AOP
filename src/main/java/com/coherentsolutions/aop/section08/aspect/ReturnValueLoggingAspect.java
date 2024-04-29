package com.coherentsolutions.aop.section08.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ReturnValueLoggingAspect {

    @AfterReturning(pointcut = "execution(* com.coherentsolutions.aop.section08.service.*.*(..))", returning = "result")
    public void logReturnValue(Object result) {
        System.out.println("Method return value: " + result);
    }
}
