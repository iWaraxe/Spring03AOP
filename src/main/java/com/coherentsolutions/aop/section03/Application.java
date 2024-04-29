package com.coherentsolutions.aop.section03;

import com.coherentsolutions.aop.section03.config.AppConfig;
import com.coherentsolutions.aop.section03.service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            MyService myService = context.getBean(MyService.class);

            // Triggering the advice associated with "allMethodsInMyService" pointcut
            System.out.println("-- Invoking performAction() --");
            myService.performAction();

            // Triggering the advice associated with "methodsWithStringParameter" pointcut
            System.out.println("-- Invoking anotherAction(String param) with 'Spring AOP' --");
            myService.anotherAction("Spring AOP");

            // Triggering the advice associated with "allGetterMethods" pointcut
            System.out.println("-- Invoking getSomething() --");
            myService.getSomething();

            // Additional method to demonstrate inclusion by "allMethodsInMyService" pointcut
            System.out.println("-- Invoking doWork() --");
            myService.doWork();
        }
    }
}