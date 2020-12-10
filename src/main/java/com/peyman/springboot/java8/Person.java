package com.peyman.springboot.java8;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    int age;

    Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String s, String s1) {
    }

    @Override
    public String toString() {
        return name;
    }
}

class FooClass {
    String name;
    List<BarClass> bars = new ArrayList<>();

    FooClass(String name) {
        this.name = name;
    }
}

class BarClass {
    String name;

    BarClass(String name) {
        this.name = name;
    }
}