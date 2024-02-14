package com.prosto.java.designPatterns.coffeeSetAbstractFactory.cuppuccinoSet;

import com.prosto.java.designPatterns.coffeeSetAbstractFactory.Dessert;

public class Truffles implements Dessert {
    @Override
    public void getDessert() {
        System.out.println("Several truffles");
    }
}
