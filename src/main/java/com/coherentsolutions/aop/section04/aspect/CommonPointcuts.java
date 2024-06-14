package com.coherentsolutions.aop.section04.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CommonPointcuts {

    @Pointcut("execution(* com.coherentsolutions.aop.section04.service.*.*(..))")
    public void serviceLayerExecution() {
        // Pointcut for all methods in the service layer
    }

    @Pointcut("execution(public * get*())")
    public void getterMethods() {
        // Pointcut for all getter methods
    }

    @Pointcut("within(com.coherentsolutions.aop.section04.service..*)")
    public void withinServiceLayer() {
        // Pointcut for all operations within service package
    }
}
