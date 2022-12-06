package com.unitedcoder.cubecartautomation;

public enum TypeDropDownVlaue {
    REGISTERED_CUSTOMER("Registered Customer"),
    UNREGISTERED_CUSTOMER("Unregistered Customer");
    private String value;
    TypeDropDownVlaue(String value) {this.value=value;}
    public String getValue(){return value;}

    public static void main(String[] args) {
        System.out.println(TypeDropDownVlaue.REGISTERED_CUSTOMER.getValue());
    }

}