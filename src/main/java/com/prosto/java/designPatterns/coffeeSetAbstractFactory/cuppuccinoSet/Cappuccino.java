package com.prosto.java.designPatterns.coffeeSetAbstractFactory.cuppuccinoSet;

import com.prosto.java.designPatterns.coffeeSetAbstractFactory.Coffee;

public class Cappuccino implements Coffee {
    @Override
    public void getCoffee() {
        System.out.println("Cup of cappuccino");
    }
}
