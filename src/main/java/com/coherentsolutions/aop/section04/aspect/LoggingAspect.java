package com.coherentsolutions.aop.section04.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("com.coherentsolutions.aop.section04.aspect.CommonPointcuts.serviceLayerExecution()")
    public void beforeServiceLayerExecution(JoinPoint joinPoint) {
        System.out.println("Before executing service layer method: " + joinPoint.getSignature().getName());
    }

    @After("com.coherentsolutions.aop.section04.aspect.CommonPointcuts.withinServiceLayer()")
    public void afterServiceLayerExecution(JoinPoint joinPoint) {
        System.out.println("After executing within service layer: " + joinPoint.getSignature().getName());
    }

    @Before("com.coherentsolutions.aop.section04.aspect.CommonPointcuts.getterMethods()")
    public void beforeGetMethods(JoinPoint joinPoint) {
        System.out.println("Before executing get method: " + joinPoint.getSignature().getName());
    }
}
