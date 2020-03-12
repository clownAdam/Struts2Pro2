package com.itlike.myform;

import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * @author Administrator
 */

public class MyFormAction3 extends ActionSupport {
    private String username;
    private String nick;
    private Integer age;
    private List<String> hobby;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    @Override
    public String execute(){
        System.out.println(username);
        System.out.println(age);
        System.out.println(hobby);
        return null;
    }

}
