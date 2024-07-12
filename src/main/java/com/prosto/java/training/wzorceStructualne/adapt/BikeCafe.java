package com.prosto.java.training.wzorceStructualne.adapt;

public class BikeCafe {
    public static void main(String[] args) {
        FrotherABC frother = new FrotherABC();
        OldCoffeeMachine coffeeMachine = new OldCoffeeMachine(frother);
        coffeeMachine.makeCappuccino();

        FrotherABCAdapter frotherABCAdapter = new FrotherABCAdapter();
        NewCoffeeMachine newCoffeeMachine = new NewCoffeeMachine(frotherABCAdapter);
        newCoffeeMachine.makeCappuccino();
    }
}
