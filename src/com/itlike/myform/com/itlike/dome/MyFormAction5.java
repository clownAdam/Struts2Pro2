package com.itlike.myform.com.itlike.dome;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author Administrator
 */

public class MyFormAction5 extends ActionSupport implements ModelDriven<User> {
    private User user = new User();
    @Override
    public String execute(){
        System.out.println("action5 user = " + user);
        return null;
    }

    @Override
    public User getModel() {
        return user;
    }
}
