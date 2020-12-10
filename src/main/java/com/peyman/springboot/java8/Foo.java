package com.peyman.springboot.java8;

import java.util.function.Consumer;

@FunctionalInterface
public interface Foo {

    String method(String string);
    default void defaultMethod() {}
}