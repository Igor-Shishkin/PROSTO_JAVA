package com.prosto.java.designPatterns.structural.adapter;

public class OldFrotherAdapter extends OldFrother implements FrotherXYZ{

    @Override
    public void heatAndFrothMilk() {
        super.heatMilk();
        super.frothMilk();
    }
}
