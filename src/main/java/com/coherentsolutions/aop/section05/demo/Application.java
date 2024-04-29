package com.coherentsolutions.aop.section05.demo;

import com.coherentsolutions.aop.section05.demo.service.payment.PaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        PaymentService paymentService = context.getBean(PaymentService.class);

        // This will trigger both logging and security checks due to the combined pointcuts
        paymentService.processPayment();

        context.close();
    }
}
