package com.prosto.java.designPatterns.structural.bridge;

public class Tea extends Beverage{

    protected Tea(Additive additive) {
        super(additive);
    }

    @Override
    void serve() {
        System.out.print("Tea");
        additive.add();
    }


}
