package com.kaheshan.dummy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //core container spring
        //object management
        //

        //IoC inversion of control
        //DI dependency injection

        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) context.getBean("student");
        Student student2 = context.getBean(Student.class);
        String str = context.getBean(String.class);

    }
}
