package com.coherentsolutions.aop.section09.service;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    public void processPayment() {
        // Simulating an exception scenario
        throw new RuntimeException("Payment processing failed");
    }

    public void updateAccount() {
        // Simulating a successful scenario
        System.out.println("Account updated successfully");
    }
}
