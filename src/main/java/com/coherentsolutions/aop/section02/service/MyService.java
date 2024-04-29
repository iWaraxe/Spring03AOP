package com.coherentsolutions.aop.section02.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void performAction() {
        System.out.println("Performing an action in MyService.");
    }

    public void anotherAction() {
        System.out.println("Performing another action in MyService.");
    }
}
