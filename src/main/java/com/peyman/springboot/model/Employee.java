package com.peyman.springboot.model;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 300002228479017363L;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private String name;
    private String family;
    private String age;

    @Override
    public String toString() {
        return String.format("%s %s",this.name,this.family);
    }
}
