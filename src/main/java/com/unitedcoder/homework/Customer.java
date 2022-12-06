package com.unitedcoder.homework;

public class Customer {
    private String title;
    private String firstName;
    private String lastName;
    private String emai;
    private long phone;
    private long cellPhone;
    private String password;
    private String confirmPassword;

    public Customer(String title, String firstName, String lastName, String emai, String password, String confirmPassword) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emai = emai;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setCellPhone(long cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmai() {
        return emai;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public static void main(String[] args) {
        Customer customer=new Customer("Mr","Idikut","Omercan",
                "Idikut@gmail.com","112233","112233");
        System.out.println(customer.getFirstName());
    }
}
