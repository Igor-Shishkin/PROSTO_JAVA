package com.prosto.java.training.wzorceStructualne.adapt;

public class FrotherABCAdapter extends FrotherABC implements FrotherXYZ{
    @Override
    public void heatAndFrothMilk() {
        super.heatMilk();
        super.frothMilk();
    }
}
