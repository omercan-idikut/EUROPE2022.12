package com.unitedcoder.jsonfile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
    @JsonProperty("customer-firstname")
    private String firstName;
    @JsonProperty("customer-lastname")
    private String lastName;
    @JsonProperty("customer-email")
    private String email;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }

    public String getFirstname() {
        return firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}