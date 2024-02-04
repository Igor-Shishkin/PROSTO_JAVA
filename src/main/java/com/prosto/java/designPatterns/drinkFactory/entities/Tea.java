package com.prosto.java.designPatterns.drinkFactory.entities;

public class Tea implements Drink{

    @Override
    public void getDrink() {
        System.out.println("You get a cup of hot tea");
    }
}
