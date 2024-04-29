package com.coherentsolutions.aop.section08;

import com.coherentsolutions.aop.section08.service.ExampleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.coherentsolutions.aop.section08")
public class Application {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class)) {
            ExampleService service = context.getBean(ExampleService.class);

            System.out.println("-- Invoking findDataById --");
            service.findDataById(10);

            System.out.println("-- Invoking calculateValue --");
            try {
                service.calculateValue(150);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
