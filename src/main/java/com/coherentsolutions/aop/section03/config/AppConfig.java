package com.coherentsolutions.aop.section03.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.coherentsolutions.aop.section03")
public class AppConfig {
    // Configuration setup for Spring AOP
}
