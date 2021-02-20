package com.kaheshan.dummy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Spring");
        System.out.println("hello");
        System.out.println(System.currentTimeMillis());
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(System.currentTimeMillis());


//        Book book  = context.getBean(Book.class);
//        Student student1 = context.getBean("student",Student.class);
//        Student student2 = context.getBean("student",Student.class);
//        boolean result = (student1 == student2);
//        System.out.println(result);

    }
}
