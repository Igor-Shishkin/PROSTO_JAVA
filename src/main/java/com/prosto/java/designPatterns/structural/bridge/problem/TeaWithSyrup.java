package com.prosto.java.designPatterns.structural.bridge.problem;

public class TeaWithSyrup extends Tea{
    @Override
    public void serve() {
        System.out.println("Tea with sugar");
    }
}
