package com.prosto.java.designPatterns.coffeeSetAbstractFactory.espressoSet;

import com.prosto.java.designPatterns.coffeeSetAbstractFactory.Dessert;

public class BountyBar implements Dessert {
    @Override
    public void getDessert() {
        System.out.println("Bounty bar topped with coconut");
    }
}
