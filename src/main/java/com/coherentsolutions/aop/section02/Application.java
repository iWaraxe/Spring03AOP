package com.coherentsolutions.aop.section02;


import com.coherentsolutions.aop.section02.config.AppConfig;
import com.coherentsolutions.aop.section02.service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            MyService myService = context.getBean(MyService.class);

            System.out.println("-- Invoking performAction() --");
            myService.performAction();

            System.out.println("-- Invoking anotherAction() --");
            myService.anotherAction();
        }
    }
}
