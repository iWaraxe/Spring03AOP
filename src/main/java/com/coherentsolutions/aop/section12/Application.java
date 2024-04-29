package com.coherentsolutions.aop.section12;

import com.coherentsolutions.aop.section12.config.AppConfig;
import com.coherentsolutions.aop.section12.service.ExampleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ExampleService service = context.getBean(ExampleService.class);
        try {
            service.performAction();  // Method that might throw exceptions
        } catch (Exception e) {
            System.out.println("Exception handled in main: " + e.getMessage());
        }
        context.close();
    }
}
