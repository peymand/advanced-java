package com.kaheshan.dummy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {


    private int age;

    private String name;
    private String family;


    //    @Qualifier("novelBook")
    private Book book;



    public Student(@Qualifier("novelBook") Book b,@Value("10") int age) {
        this.book = b;
        this.age = age;
    }

    public void doSomething() {
        System.out.println("in do something method...");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
