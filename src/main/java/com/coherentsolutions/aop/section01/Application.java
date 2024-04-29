package com.coherentsolutions.aop.section01;

import com.coherentsolutions.aop.section01.service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.coherentsolutions.aop.section01")
@EnableAspectJAutoProxy
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        MyService myService = context.getBean(MyService.class);

        System.out.println("-- Invoking performAction() --");
        myService.performAction();

        System.out.println("-- Invoking anotherAction() --");
        myService.anotherAction();

        context.close();
    }
}
