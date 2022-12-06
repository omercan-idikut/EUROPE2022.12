package com.unitedcoder.oopsconcept.interfacetutorial;

import com.unitedcoder.oopsconcept.inheritancetutorial.BaseClass;

public interface CubecartFunctions {

    void  logIn(String userName,String password);
    void addCustomer();
    boolean verifyCustomerAdded();
}
class Functions implements CubecartFunctions{

    @Override
    public void logIn(String userName, String password) {

    }

    @Override
    public void addCustomer() {

    }

    @Override
    public boolean verifyCustomerAdded() {
        return false;
    }
}
class Test extends BaseClass {
    public static void main(String[] args) {
    Functions functions=new Functions();
    functions.logIn("", "");

}}
