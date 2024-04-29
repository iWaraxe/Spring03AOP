package com.coherentsolutions.aop.section11.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.coherentsolutions.aop.section11")
public class AppConfig {
    // This class remains empty, serving as a configuration placeholder.
}
