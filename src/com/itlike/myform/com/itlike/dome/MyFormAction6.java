package com.itlike.myform.com.itlike.dome;

import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * @author Administrator
 */

public class MyFormAction6 extends ActionSupport {
    private List<Goods> goodsList;

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public String execute(){
        System.out.println("goodsList = " + goodsList);
        return null;
    }

}
