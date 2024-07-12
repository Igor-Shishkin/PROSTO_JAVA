package com.prosto.java.training.wzorceStructualne.adapt;

public class NewCoffeeMachine {
    private final FrotherABCAdapter frother;

    public NewCoffeeMachine(FrotherABCAdapter frother) {
        this.frother = frother;
    }
    public void makeEspresso(){
        System.out.println("The strongest espresso");
    }
    public void addFrothedHotMilk(){
        frother.heatAndFrothMilk();
        System.out.println("Milk is added");
    }

    public void makeCappuccino() {
        makeEspresso();
        addFrothedHotMilk();
    }
}
