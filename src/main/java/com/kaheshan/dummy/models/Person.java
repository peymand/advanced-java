package com.kaheshan.dummy.models;

public class Person {
    private int age;
    private String name;
    private String family;

    public Person(){}

    public Person(String name, String family, int age) {
        this.name = name;
        this.age = age;
        this.family = family;
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
}
