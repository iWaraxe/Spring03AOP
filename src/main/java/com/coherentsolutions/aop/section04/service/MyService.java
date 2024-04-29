package com.coherentsolutions.aop.section04.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void performAction() {
        System.out.println("Performing an action in MyService.");
    }

    public void getPerformAnotherAction() {
        System.out.println("Performing another action in MyService.");
    }
}
