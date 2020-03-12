package com.itlike.myform.com.itlike.dome;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * @author Administrator
 */

public class MyFormAction7 extends ActionSupport {
    private Map<String,Goods> goodsMap;

    public Map<String, Goods> getGoodsMap() {
        return goodsMap;
    }

    public void setGoodsMap(Map<String, Goods> goodsMap) {
        this.goodsMap = goodsMap;
    }

    @Override
    public String execute(){
        System.out.println("goodsMap = " + goodsMap);
        return null;
    }

}
