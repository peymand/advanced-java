package com.kaheshan.dummy;

import org.springframework.stereotype.Component;

@Component
public class NovelBook implements Book {

    private int price;


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
