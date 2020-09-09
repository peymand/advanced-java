package com.kaheshan.dummy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*
    Author: Peyman Dodangeh,
    Date : 9/9/2020,
    Time : 9:52 AM
*/
@Configuration
@ComponentScan(basePackages = "com.kaheshan.dummy")
@PropertySource("classpath:foo.properties")
public class Config {
    @Bean
    public Student student(){
        return new Student();
    }
}
