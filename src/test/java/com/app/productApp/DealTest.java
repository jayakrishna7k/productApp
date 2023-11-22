package com.app.productApp;

import com.app.productApp.deal.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class DealTest {
     Deal deal =new Deal();

     DealLoader dealLoader = new FileBasedDealLoader();
    @Test
    void testDeal(){
        when(deal.getSettlement(any())).thenReturn(new Dict());
        when(dealLoader.getForProduct(any())).thenReturn(getdummyproductdata());
        DealWrapper dealWrapper= DealLoader.getDefaultDealLoader().getForProduct("BOND");
        assertNotNull(dealWrapper);
    }
    public DealWrapper getdummyproductdata() {
        Deal deal=new Deal();
        DealWrapper wrapper=new DealWrapper();
        wrapper.setDeal(deal);
        wrapper.setProduct("BOND");
        wrapper.setSource("123456");
        return wrapper;
    }
}
