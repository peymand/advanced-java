package com.peyman.springboot.java8;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class LambdaExpression {

    public static void main(String[] args) {
        UseFoo useFoo = new UseFoo();
        Foo foo = parameter -> parameter + " from lambda";
        String result = useFoo.add("Message ", foo);


        Function<String, String> fn =
                parameter -> parameter + " from lambda";
        String result2 = useFoo.add("Message ", fn);

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, (a, b) -> b.compareTo(a));


        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
//        Converter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123

        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");



        //see Lambda4 class


    }
}

class Lambda4 {
    static int outerStaticNum;
    int outerNum;

    void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };

        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
    }
}
