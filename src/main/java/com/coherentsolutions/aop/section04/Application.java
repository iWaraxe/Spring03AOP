package com.coherentsolutions.aop.section04;

import com.coherentsolutions.aop.section04.config.AppConfig;
import com.coherentsolutions.aop.section04.service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService myService = context.getBean(MyService.class);

        myService.performAction();
        myService.getPerformAnotherAction();

        context.close();
    }
}

