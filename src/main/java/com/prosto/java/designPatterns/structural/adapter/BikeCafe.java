package com.prosto.java.designPatterns.structural.adapter;

public class BikeCafe {

    public static void main(String[] args) {
//        OldFrother frother = new OldFrother();
//        OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine(frother);
//        oldCoffeeMachine.makeCappuccino();

        OldFrotherAdapter frotherABCAdapter = new OldFrotherAdapter();
        NewCoffeeMachine newCoffeeMachine = new NewCoffeeMachine(frotherABCAdapter);
        newCoffeeMachine.makeCappuccino();






//        OldFrotherAdapter frotherABCAdapter = new OldFrotherAdapter();
//        NewCoffeeMachine newCoffeeMachine = new NewCoffeeMachine();
//        newCoffeeMachine.makeCappuccino();
    }
}
