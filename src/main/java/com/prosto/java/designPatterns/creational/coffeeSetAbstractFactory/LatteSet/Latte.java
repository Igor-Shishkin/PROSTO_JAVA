package com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.LatteSet;

import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.Coffee;

public class Latte implements Coffee {
    @Override
    public void getCoffee() {
        System.out.println("Glass of latte");
    }
}
