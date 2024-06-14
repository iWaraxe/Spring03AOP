package com.coherentsolutions.aop.section00.pureOOP.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public void addCustomer(String customerId, String name) {
        // Logging logic
        System.out.println("Starting transaction for addCustomer method.");
        System.out.println("Before method: addCustomer, Arguments: " + customerId + ", " + name);

        // Business logic
        System.out.println("Adding customer with ID: " + customerId + " and Name: " + name);

        // Logging logic
        System.out.println("Committing transaction for addCustomer method.");
        System.out.println("After method: addCustomer");
    }

    public void deleteCustomer(String customerId) {
        // Logging logic
        System.out.println("Starting transaction for deleteCustomer method.");
        System.out.println("Before method: deleteCustomer, Arguments: " + customerId);

        // Business logic
        System.out.println("Deleting customer with ID: " + customerId);

        // Logging logic
        System.out.println("Committing transaction for deleteCustomer method.");
        System.out.println("After method: deleteCustomer");
    }

    public String getCustomerDetails(String customerId) {
        // Logging logic
        System.out.println("Starting transaction for getCustomerDetails method.");
        System.out.println("Before method: getCustomerDetails, Arguments: " + customerId);

        // Business logic
        System.out.println("Getting details for customer with ID: " + customerId);
        String customerDetails = "Customer Name: John Doe"; // Simulate returning customer details

        // Logging logic
        System.out.println("Committing transaction for getCustomerDetails method.");
        System.out.println("After method: getCustomerDetails, Returned: " + customerDetails);

        return customerDetails;
    }
}
