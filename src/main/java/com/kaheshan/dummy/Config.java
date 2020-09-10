package com.kaheshan.dummy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
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

    @Bean("text")
    public String getText(){
        return new String("Sample");
    }
    @Bean
    @Autowired
    public Student student(Book novelBook, @Value("10") int age){

        return new Student(novelBook,age);
    }
}
