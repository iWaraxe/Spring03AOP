package com.coherentsolutions.aop.section03.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    // This matches the "allMethodsInMyService" pointcut
    public void performAction() {
        System.out.println("Performing an action in MyService.");
    }

    // This method matches the "methodsWithStringParameter" pointcut
    public void anotherAction(String param) {
        System.out.println("Performing another action in MyService with parameter: " + param);
    }

    // This method matches the "allGetterMethods" pointcut
    public String getSomething() {
        System.out.println("Inside getSomething of MyService.");
        return "Something";
    }

    // Additional method that doesn't directly match any of the specified pointcuts
    // but will be included because of the "allMethodsInMyService" pointcut
    public void doWork() {
        System.out.println("Doing work in MyService.");
    }
}