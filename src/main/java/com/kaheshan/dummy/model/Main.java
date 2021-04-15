package com.kaheshan.dummy.model;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] hobbies = {"football" , "camping"};
        System.out.println(hobbies);
        List<String> hobbies2 = new ArrayList<>();
        hobbies2.add("football");
        hobbies2.add("camping");
        System.out.println(hobbies2);
    }
}
