package com.coherentsolutions.aop.section10.service;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    public void performTask() {
        System.out.println("Performing a task in ExampleService.");
    }

    public void anotherTask() {
        System.out.println("Performing another task in ExampleService.");
    }
}
