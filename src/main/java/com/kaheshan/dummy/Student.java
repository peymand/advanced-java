package com.kaheshan.dummy;

public class Student {

    private int age;
    private String name;
    private String family;

  public Student(){}

    public void doSomething(){
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
}
