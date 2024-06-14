package com.coherentsolutions.aop.section00.modernAOP.service;

import org.springframework.stereotype.Service;

@Service
public class BankService {

    public void deposit(String accountNumber, double amount) {
        System.out.println("Depositing " + amount + " to account " + accountNumber);
        // Simulate transaction logic
    }

    public void withdraw(String accountNumber, double amount) {
        System.out.println("Withdrawing " + amount + " from account " + accountNumber);
        if (amount > 500) {
            throw new RuntimeException("Amount exceeds withdrawal limit");
        }
        // Simulate transaction logic
    }

    public double getBalance(String accountNumber) {
        System.out.println("Getting balance for account " + accountNumber);
        return 1000.0; // Simulate returning a balance
    }
}
