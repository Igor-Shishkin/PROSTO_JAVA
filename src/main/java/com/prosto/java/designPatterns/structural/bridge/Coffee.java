package com.prosto.java.designPatterns.structural.bridge;

public class Coffee extends Beverage {

    protected Coffee(Additive additive) {
        super(additive);
    }

    @Override
    void serve() {
        System.out.print("Coffee");
        additive.add();
    }
}
