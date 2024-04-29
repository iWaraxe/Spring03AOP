package com.coherentsolutions.aop.section10;

import com.coherentsolutions.aop.section10.config.AppConfig;
import com.coherentsolutions.aop.section10.service.ExampleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationTester {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            ExampleService service = context.getBean(ExampleService.class);
            service.performTask();
            service.anotherTask();
        }
    }
}
