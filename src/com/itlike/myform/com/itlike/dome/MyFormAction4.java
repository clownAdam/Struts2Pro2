package com.itlike.myform.com.itlike.dome;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 */

public class MyFormAction4 extends ActionSupport {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute(){
        System.out.println("user = " + user);
        return null;
    }

}
