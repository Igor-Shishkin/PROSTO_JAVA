package com.prosto.java.designPatterns.creational.drinkFactory.entities;

public class Lemonade implements Drink{
    @Override
    public void getDrink() {
        System.out.println("You get a glass of cool ice lemonade");
    }
}
