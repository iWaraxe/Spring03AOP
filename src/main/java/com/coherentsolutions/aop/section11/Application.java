package com.coherentsolutions.aop.section11;

import com.coherentsolutions.aop.section11.config.AppConfig;
import com.coherentsolutions.aop.section11.service.ExampleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Application {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            ExampleService service = context.getBean(ExampleService.class);
            String result = service.performAction();
            System.out.println(result);
            result = service.performFastAction();
            System.out.println(result);
        }
    }
}
