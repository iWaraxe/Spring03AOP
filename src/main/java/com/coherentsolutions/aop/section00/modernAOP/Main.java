package com.coherentsolutions.aop.section00.modernAOP;

import com.coherentsolutions.aop.section00.modernAOP.service.BankService;
import com.coherentsolutions.aop.section00.modernAOP.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BankService bankService = context.getBean(BankService.class);
        CustomerService customerService = context.getBean(CustomerService.class);

        try {
            bankService.deposit("12345", 200);
            double balance = bankService.getBalance("12345");
            System.out.println("Current balance: " + balance);
            bankService.withdraw("12345", 600);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            customerService.addCustomer("C001", "John Doe");
            String details = customerService.getCustomerDetails("C001");
            System.out.println("Customer details: " + details);
            customerService.deleteCustomer("C001");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
