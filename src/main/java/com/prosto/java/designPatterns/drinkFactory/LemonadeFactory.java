package com.prosto.java.designPatterns.drinkFactory;

public class LemonadeFactory implements DrinkFactory{
    @Override
    public Drink createDrink() {
        return new Lemonade();
    }
}
