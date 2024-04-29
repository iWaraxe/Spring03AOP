package com.coherentsolutions.aop.section08.service;

import com.coherentsolutions.aop.section08.annotations.ValidateReturn;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    public String findDataById(int id) {
        return "Data for ID: " + id;
    }

    @ValidateReturn
    public int calculateValue(int input) {
        // Simulate calculation
        return input - 100;
    }
}
