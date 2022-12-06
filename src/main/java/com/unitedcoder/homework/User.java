package com.unitedcoder.homework;

public class User {
    //Implement a class User. A user has a username (a string), a password (a string), a role (as string), and an active (a boolean)
    //Provide a constructor with all parameters.
    private String userNmae;
    private String password;
    private String role;
    private boolean active;

    public User(String userNmae, String password, String role, boolean active) {
        this.userNmae = userNmae;
        this.password = password;
        this.role = role;
        this.active = active;
    }

    public String getUserNmae() {
        return userNmae;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "User{" +
                "userNmae='" + userNmae + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", active=" + active +
                '}';
    }

    public static void main(String[] args) {
        User user=new User("Idikut","112233","Student",true);
        System.out.println(user);
        System.out.println("name: "+user.getUserNmae());

    }
}
