package com.coherentsolutions.aop.section09;

import com.coherentsolutions.aop.section09.service.ExampleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.coherentsolutions.aop.section09")
public class Application {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class)) {
            ExampleService service = context.getBean(ExampleService.class);

            try {
                service.processPayment();
            } catch (Exception e) {
                // Exception will be caught and logged by the ExceptionLoggingAspect
            }

            service.updateAccount();
        }
    }
}
