package com.peyman.springboot.activitiwithspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ActivitiWithSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(ActivitiWithSpringApplication.class, args);
    }
}
