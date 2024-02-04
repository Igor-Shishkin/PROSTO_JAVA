package com.prosto.java.designPatterns.drinkFactory.entities;

public class Lemonade implements Drink{
    @Override
    public void getDrink() {
        System.out.println("You get a glass of cool ice lemonade");
    }
}
