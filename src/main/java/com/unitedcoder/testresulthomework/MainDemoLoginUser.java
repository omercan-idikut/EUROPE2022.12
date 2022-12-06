package com.unitedcoder.testresulthomework;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MainDemoLoginUser {
    @JsonProperty("name")
    private String name;
    @JsonProperty("password")
    private String password;

    public MainDemoLoginUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public MainDemoLoginUser() {
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }


    @Override
    public String toString() {
        return "LoginUser{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

