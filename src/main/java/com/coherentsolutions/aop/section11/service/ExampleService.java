package com.coherentsolutions.aop.section11.service;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    public String performAction() {
        // Simulating some processing
        try {
            Thread.sleep(100); // simulate delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Action Performed";
    }

    public String performFastAction() {
        // Simulating some processing
        try {
            Thread.sleep(10); // simulate delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Fast Action Performed";
    }
}
