package com.coherentsolutions.aop.section06;

import com.coherentsolutions.aop.section06.config.ApplicationConfig;
import com.coherentsolutions.aop.section06.service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        MyService myService = context.getBean(MyService.class);
        myService.performAction();
        context.close();
    }
}
