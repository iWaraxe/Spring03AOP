package com.coherentsolutions.aop.section02.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.coherentsolutions.aop.section02")
public class AppConfig {
    // AppConfig remains empty as it primarily serves to enable component scanning and AOP proxying
}
