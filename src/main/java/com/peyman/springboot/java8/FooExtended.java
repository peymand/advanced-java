package com.peyman.springboot.java8;

public interface FooExtended extends Bar,Baz {
    @Override
    default String defaultCommon() {
        return Bar.super.defaultCommon();
    }
}
