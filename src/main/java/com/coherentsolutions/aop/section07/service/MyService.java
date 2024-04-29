package com.coherentsolutions.aop.section07.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void performAction(String action) {
        System.out.println("Performing action: " + action);
    }

    public void accessAccount(Long accountId) {
        System.out.println("Accessing account ID: " + accountId);
    }
}
