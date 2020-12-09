package com.peyman.springboot.java8;

@FunctionalInterface
public interface Bar {
    String method(String string);
    default String defaultBar() {return "";}
    default String defaultCommon() {return "";}
}