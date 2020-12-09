package com.peyman.springboot.java8;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}