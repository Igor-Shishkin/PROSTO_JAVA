package com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.cuppuccinoSet;

import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.Sprinkles;

public class GratedChocolate implements Sprinkles {
    @Override
    public void getSprinkles() {
        System.out.println("Sprinkle grated chocolate on top");
    }
}
