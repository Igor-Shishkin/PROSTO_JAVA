package com.prosto.java.designPatterns.creational.drinkFactory.entities;

public class Coffee implements Drink{

    @Override
    public void getDrink() {
        System.out.println("You get a cup of aromatic coffee");
    }
}
