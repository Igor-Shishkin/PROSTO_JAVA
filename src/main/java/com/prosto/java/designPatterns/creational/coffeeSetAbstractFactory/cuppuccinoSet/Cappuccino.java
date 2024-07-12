package com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.cuppuccinoSet;

import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.Coffee;

public class Cappuccino implements Coffee {
    @Override
    public void getCoffee() {
        System.out.println("Cup of cappuccino");
    }
}
