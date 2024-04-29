package com.coherentsolutions.aop.section07;

import com.coherentsolutions.aop.section07.config.AppConfig;
import com.coherentsolutions.aop.section07.service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            MyService myService = context.getBean(MyService.class);
            myService.performAction("Sample Action");
            myService.accessAccount(12345L);
        }
    }
}
