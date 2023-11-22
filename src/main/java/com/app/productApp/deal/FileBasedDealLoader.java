package com.app.productApp.deal;

public class FileBasedDealLoader implements DealLoader{
    @Override
    public DealWrapper getForProduct(String product) {
        Deal deal=new Deal();
        DealWrapper wrapper=new DealWrapper();
        wrapper.setDeal(deal);
        wrapper.setProduct("BOND");
        wrapper.setSource("123456");
        return wrapper;
    }
}
