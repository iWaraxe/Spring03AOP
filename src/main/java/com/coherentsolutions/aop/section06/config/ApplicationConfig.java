package com.coherentsolutions.aop.section06.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.coherentsolutions.aop.section06")
public class ApplicationConfig {
    // Class remains empty, serves only as a configuration holder
}
