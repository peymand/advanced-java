package com.kaheshan.dummy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.kaheshan.dummy")
@PropertySource("classpath:data.properties")
public class SpringConfig {

    @Autowired
    @Bean("string")
    public String getString(Student student){
        return new String("");
    }

}
