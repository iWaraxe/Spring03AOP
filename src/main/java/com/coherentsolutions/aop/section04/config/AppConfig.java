package com.coherentsolutions.aop.section04.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.coherentsolutions.aop.section04")
public class AppConfig {
    // This configuration class enables AspectJ auto-proxying and component scanning.
}
