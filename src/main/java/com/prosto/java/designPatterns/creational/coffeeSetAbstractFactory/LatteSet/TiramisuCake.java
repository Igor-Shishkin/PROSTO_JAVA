package com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.LatteSet;

import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.Dessert;

public class TiramisuCake implements Dessert {
    @Override
    public void getDessert() {
        System.out.println("A piece of aromatic tiramisu");
    }
}
