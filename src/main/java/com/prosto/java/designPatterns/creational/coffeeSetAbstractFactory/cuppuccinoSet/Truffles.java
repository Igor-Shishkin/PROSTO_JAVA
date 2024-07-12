package com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.cuppuccinoSet;

import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.Dessert;

public class Truffles implements Dessert {
    @Override
    public void getDessert() {
        System.out.println("Several truffles");
    }
}
