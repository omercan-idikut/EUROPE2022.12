package com.unitedcoder.cubecartautomation;

public class CustomerInfo {
    private String firstName;
    private String lastName;
    private String title;
    private String email;

    public CustomerInfo() {
    }

    public CustomerInfo(String firstName, String lastName, String title, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }
}