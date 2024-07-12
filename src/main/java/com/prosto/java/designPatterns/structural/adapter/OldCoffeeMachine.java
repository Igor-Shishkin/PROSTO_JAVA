package com.prosto.java.designPatterns.structural.adapter;

public class OldCoffeeMachine {
    private final FrotherABC frother;

    public OldCoffeeMachine(FrotherABC frother) {
        this.frother = frother;
    }

    public void makeEspresso(){
        System.out.println("The strongest espresso");
    }

    public void addFrothedHotMilk(){
        frother.heatMilk();
        frother.frothMilk();
        System.out.println("Milk is added");
    }

    public void makeCappuccino() {
        makeEspresso();
        addFrothedHotMilk();
    }
}
