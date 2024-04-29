package com.coherentsolutions.aop.section06.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void performAction() {
        System.out.println("Performing a service action...");
    }
}
