package com.prosto.java.designPatterns.drinkFactory;

public class Coffee implements Drink{

    @Override
    public void getDrink() {
        System.out.println("You get a cup of aromatic coffee");
    }
}
