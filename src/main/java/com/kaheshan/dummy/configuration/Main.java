package com.kaheshan.dummy.configuration;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Main {

    public static void main(String[] args) {
        BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
        System.out.println(bcrypt.encode("1234"));
    }
}
