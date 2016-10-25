package com.dvoss.arrays;

/**
 * Created by Dan on 10/25/16.
 */
public enum Car {
    HONDA(20), LEXUS(30), AUDI(40), BMW(50);
    private int price;
    Car(int p) {
        price = p;
    }
    public int getPrice() {
        return price;
    }
}
