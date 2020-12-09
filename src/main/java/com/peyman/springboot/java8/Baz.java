package com.peyman.springboot.java8;

@FunctionalInterface
public interface Baz {
    String method(String string);
    default String defaultBaz() { return "";}
    default String defaultCommon(){return "";}
}

