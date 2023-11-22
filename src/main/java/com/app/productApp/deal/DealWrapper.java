package com.app.productApp.deal;

public class DealWrapper
{
    private Deal deal;
    private String source;
    private String product;
    private DealError dealError;

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public DealError getDealError() {
        return dealError;
    }

    public void setDealError(DealError dealError) {
        this.dealError = dealError;
    }
}
