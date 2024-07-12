package com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.espressoSet;

import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.Sprinkles;

public class Nutmag implements Sprinkles {
    @Override
    public void getSprinkles() {
        System.out.println("Sprinkle nutmeg on top");
    }
}
