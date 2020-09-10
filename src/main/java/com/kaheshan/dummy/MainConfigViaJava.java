package com.kaheshan.dummy;
/*
    Author: Peyman Dodangeh,
    Date : 9/9/2020,
    Time : 9:51 AM
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainConfigViaJava {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);


        String s =  context.getBean("text",String.class);
        Student student1 = context.getBean("student",Student.class);
        Student student2 = context.getBean("student",Student.class);
        boolean result = (student1 == student2);
        System.out.println(result);
    }
}
