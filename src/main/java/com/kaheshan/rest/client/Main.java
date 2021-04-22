package com.kaheshan.rest.client;

import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id =  scanner.nextLine();
        RestTemplate template = new RestTemplate();
        String s = template.getForObject("http://localhost:8080/customer/list",String.class);
        System.out.println(s);
    }
}
