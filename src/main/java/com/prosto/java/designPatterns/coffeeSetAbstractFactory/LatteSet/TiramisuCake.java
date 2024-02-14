package com.prosto.java.designPatterns.coffeeSetAbstractFactory.LatteSet;

import com.prosto.java.designPatterns.coffeeSetAbstractFactory.Dessert;

public class TiramisuCake implements Dessert {
    @Override
    public void getDessert() {
        System.out.println("A piece of aromatic tiramisu");
    }
}
