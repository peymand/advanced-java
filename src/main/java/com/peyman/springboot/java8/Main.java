package com.peyman.springboot.java8;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        UnaryOperator<String> s = () ->



        Supplier x = () -> "";
        Function<String,Integer> f = (input) -> {return 12;};
        Integer x2 =  f.apply("ali");
        Animal animal = () -> System.out.println("Hello Lambda!!!");
        animal.voice();
        TellingMachine tm = (s1,s2) -> s1 + s2;
        Runnable r1 = Main::f;

        new Thread(r1);
        String result = tm.replyText("ali","");
        System.out.println(result);

        Bar b = s -> Integer.parseInt(s);
        int res = b.convert("123");

    }

    public static void f(){
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
        }
    }

    public static Bar getBar(){
        return (s) -> Integer.parseInt(s);

    }
}
