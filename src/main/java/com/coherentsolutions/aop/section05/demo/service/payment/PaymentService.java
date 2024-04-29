package com.coherentsolutions.aop.section05.demo.service.payment;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaymentService {

    @Transactional
    public void processPayment() {
        System.out.println("Processing payment...");
    }
}
