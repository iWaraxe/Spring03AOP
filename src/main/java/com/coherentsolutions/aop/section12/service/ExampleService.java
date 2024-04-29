package com.coherentsolutions.aop.section12.service;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    public void performAction() throws Exception {
        System.out.println("Performing an action that may throw an exception.");
        throw new Exception("Sample exception");
    }
}
