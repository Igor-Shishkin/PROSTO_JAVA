package com.prosto.java.designPatterns.structural.adapter;

public class NewCoffeeMachine {
    private final FrotherXYZ frother;

    public NewCoffeeMachine(FrotherXYZ frother) {
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
