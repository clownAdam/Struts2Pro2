package com.itlike.myform.com.itlike.dome;

import java.util.List;

/**
 * @author Administrator
 */
public class User {
    private String username;
    private String nick;
    private Integer age;
    private List<String> hobby;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", nick='" + nick + '\'' +
                ", age=" + age +
                ", hobby=" + hobby +
                '}';
    }
}
