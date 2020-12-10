package com.peyman.springboot.java8;

@FunctionalInterface
public interface Bar {
    Integer convert(String string);
    default String defaultBar() {return "";}
    default String defaultCommon() {return "";}
}