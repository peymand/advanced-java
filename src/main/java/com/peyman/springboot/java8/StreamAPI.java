package com.peyman.springboot.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {


    public static void main(String[] args) {


        Stream<String> streamBuilder =
                Stream.<String>builder().add("a").add("b").add("c").build();


        List<String> myList =
                Arrays.asList("a1", "a2", "b4", "c22", "c12");
        Stream<String> stream = myList.stream();
        Predicate<String> startsWithA = s -> s.startsWith("a");

        // operation pipeline
        myList
                .stream()
                .map(s->Integer.parseInt(s.substring(1)))
                .map(Math::abs)
                .sorted()
                .forEach(System.out::println);


        Arrays.stream(new int[] {1, 2, 3})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);  // 5.0

        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);  // 3
        //number of Operation

        Stream.of("d2", "a2", "b1", "b3", "c")
//                .sorted(String::compareTo)
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));

        //add sort
    }
}
