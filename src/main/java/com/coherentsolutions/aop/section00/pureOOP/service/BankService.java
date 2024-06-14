package com.coherentsolutions.aop.section00.pureOOP.service;

import org.springframework.stereotype.Service;

@Service
public class BankService {

    public void deposit(String accountNumber, double amount) {
        // Logging logic
        System.out.println("Starting transaction for deposit method.");
        System.out.println("Before method: deposit, Arguments: " + accountNumber + ", " + amount);

        // Business logic
        System.out.println("Depositing " + amount + " to account " + accountNumber);

        // Logging logic
        System.out.println("Committing transaction for deposit method.");
        System.out.println("After method: deposit");
    }

    public void withdraw(String accountNumber, double amount) {
        // Logging logic
        System.out.println("Starting transaction for withdraw method.");
        System.out.println("Before method: withdraw, Arguments: " + accountNumber + ", " + amount);

        // Business logic
        System.out.println("Withdrawing " + amount + " from account " + accountNumber);
        if (amount > 500) {
            System.out.println("Rolling back transaction for withdraw method.");
            throw new RuntimeException("Amount exceeds withdrawal limit");
        }

        // Logging logic
        System.out.println("Committing transaction for withdraw method.");
        System.out.println("After method: withdraw");
    }

    public double getBalance(String accountNumber) {
        // Logging logic
        System.out.println("Starting transaction for getBalance method.");
        System.out.println("Before method: getBalance, Arguments: " + accountNumber);

        // Business logic
        System.out.println("Getting balance for account " + accountNumber);
        double balance = 1000.0; // Simulate returning a balance

        // Logging logic
        System.out.println("Committing transaction for getBalance method.");
        System.out.println("After method: getBalance, Returned: " + balance);

        return balance;
    }
}
