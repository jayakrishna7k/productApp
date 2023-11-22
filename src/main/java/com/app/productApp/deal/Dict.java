package com.app.productApp.deal;

import java.util.HashMap;
import java.util.Map;

public class Dict{
    private Map<String,Object> orderMap =new HashMap<>();

    public Map<String, Object> getOrderMap() {
        orderMap.put("Amount","100");
        orderMap.put("Book","123456");
        return orderMap;
    }

    public void setOrderMap(Map<String, Object> orderMap) {
        this.orderMap = orderMap;
    }
}
