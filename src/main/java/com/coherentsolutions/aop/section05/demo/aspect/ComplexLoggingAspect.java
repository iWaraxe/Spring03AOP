package com.coherentsolutions.aop.section05.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ComplexLoggingAspect {

    @Pointcut("within(com.coherentsolutions.aop.section05.demo.service..*) || within(com.coherentsolutions.aop.section05.demo.repository..*)")
    private void serviceOrRepositoryLayer() {}

    @Pointcut("execution(* get*())")
    private void getterMethods() {}

    @Pointcut("serviceOrRepositoryLayer() && !getterMethods()")
    public void loggingOperation() {}

    @Before("loggingOperation()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Executing: " + joinPoint.getSignature().getName());
    }
}
