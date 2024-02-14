package com.prosto.java.designPatterns.coffeeSetAbstractFactory.espressoSet;

import com.prosto.java.designPatterns.coffeeSetAbstractFactory.Coffee;

public class Espresso implements Coffee {
    @Override
    public void getCoffee() {
        System.out.println("A cup of the strongest espresso");
    }
}
