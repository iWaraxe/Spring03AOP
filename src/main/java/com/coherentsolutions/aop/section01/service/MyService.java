package com.coherentsolutions.aop.section01.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void performAction() {
        //log before
        System.out.println("Performing an action in MyService");
        //log after
    }

    public void anotherAction() {
        //log before
        System.out.println("Performing another action in MyService");
        //log after
    }
}
