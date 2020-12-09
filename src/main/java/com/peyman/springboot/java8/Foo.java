package com.peyman.springboot.java8;

@FunctionalInterface
public interface Foo {
    String method(String string);
    default void defaultMethod() {}
}