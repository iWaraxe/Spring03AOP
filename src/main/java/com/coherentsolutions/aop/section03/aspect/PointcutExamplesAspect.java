package com.coherentsolutions.aop.section03.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointcutExamplesAspect {

    // Directly specifying pointcut expression within @Before advice
    @Before("execution(* com.coherentsolutions.aop.section03.service.MyService.*(..))")
    public void beforeAllMethodsInMyService() {
        System.out.println("Before any method in MyService.");
    }

    @Before("execution(* com.coherentsolutions.aop.section03..*.get*())")
    public void beforeAllGetterMethods() {
        System.out.println("Before getter methods across section03 package and subpackages.");
    }

    @Before("execution(* com.coherentsolutions.aop.section03..*.*(.., java.lang.String, ..))")
    public void beforeMethodsWithStringParameter() {
        System.out.println("Before methods with String parameter across section03 package and subpackages.");
    }
}
