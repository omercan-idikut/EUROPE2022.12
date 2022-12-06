package com.unitedcoder.cubecartautomation;

public class LoginUser extends com.unitedcoder.jsonfile.LoginUser {
     private String userName;
     private String password;
     private String email;
     private String userType;

    public LoginUser() {
    }

    public LoginUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public LoginUser(String userName, String password, String email, String userType) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public String getUserType() {
        return userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
