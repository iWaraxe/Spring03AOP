package com.coherentsolutions.aop.section00.modernAOP.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public void addCustomer(String customerId, String name) {
        System.out.println("Adding customer with ID: " + customerId + " and Name: " + name);
    }

    public void deleteCustomer(String customerId) {
        System.out.println("Deleting customer with ID: " + customerId);
    }

    public String getCustomerDetails(String customerId) {
        System.out.println("Getting details for customer with ID: " + customerId);
        return "Customer Name: John Doe"; // Simulate returning customer details
    }
}
