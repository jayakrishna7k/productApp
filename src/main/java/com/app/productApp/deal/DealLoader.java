package com.app.productApp.deal;

public interface DealLoader extends DealSource {
    static DealLoader getDefaultDealLoader(){
        return new FileBasedDealLoader();
    }
}
