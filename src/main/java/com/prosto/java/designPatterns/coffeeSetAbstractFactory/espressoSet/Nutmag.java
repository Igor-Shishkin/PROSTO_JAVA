package com.prosto.java.designPatterns.coffeeSetAbstractFactory.espressoSet;

import com.prosto.java.designPatterns.coffeeSetAbstractFactory.Sprinkles;

public class Nutmag implements Sprinkles {
    @Override
    public void getSprinkles() {
        System.out.println("Sprinkle nutmeg on top");
    }
}
