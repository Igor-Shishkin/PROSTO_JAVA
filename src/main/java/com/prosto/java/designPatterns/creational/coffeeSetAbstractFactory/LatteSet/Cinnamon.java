package com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.LatteSet;

import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.Sprinkles;

public class Cinnamon implements Sprinkles {
    @Override
    public void getSprinkles() {
        System.out.println("Sprinkle cinnamon on top");
    }
}
