package com.app.productApp.deal;

public class Deal implements DealInfo {
    public static Dict settlement=new Dict();
    @Override
    public Dict getSettlement(int i) {
        return settlement;
    }

}
