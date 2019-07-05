package com.ak.ff4j;

import org.ff4j.FF4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig
{
    @Bean(value = "ff4j")
    public FF4j getFF4j() {
        return new FF4j("ff4j.xml");
    }
}