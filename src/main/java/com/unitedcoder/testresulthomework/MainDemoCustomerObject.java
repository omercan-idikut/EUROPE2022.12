package com.unitedcoder.testresulthomework;

public class MainDemoCustomerObject {
    private boolean status;
    private String title;
    private String firstName;
    private String lastName;
    private String Type;
    private String email;
    private String phone;
    private String cellPhone;
    private String subscribedToNewsletter;

    public MainDemoCustomerObject() {
    }

    public MainDemoCustomerObject(boolean status, String title, String firstName, String lastName, String type, String email, String phone, String cellPhone, String subscribedToNewsletter) {
        this.status = status;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        Type = type;
        this.email = email;
        this.phone = phone;
        this.cellPhone = cellPhone;
        this.subscribedToNewsletter = subscribedToNewsletter;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getSubscribedToNewsletter() {
        return subscribedToNewsletter;
    }

    public void setSubscribedToNewsletter(String subscribedToNewsletter) {
        this.subscribedToNewsletter = subscribedToNewsletter;
    }
}