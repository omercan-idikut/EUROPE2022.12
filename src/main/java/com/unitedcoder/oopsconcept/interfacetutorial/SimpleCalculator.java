package com.unitedcoder.oopsconcept.interfacetutorial;

public interface SimpleCalculator {
    static final int version=2;
    String type="AType";

    double addTowNumbers(int a, int b);

    //only accept abstract method
    double addTwoNumbers(int a,int b);//method name,return type,arguments no implementation
    int addMultipleNumbers(int...numbers);
    double multipleytwoNumbers(double d1,double d2);
    float divideTwoNumbers(double x,double y);
    long subtractNumbers(long l1,long l2);
    void printCalculatorInfo();

    double multiplytwoNumbers(double d1, double d2);

    float divideTowNumbers(double x, double y);

    long subtractTwoNumbers(long l1, long l2);

    double minValue(int x, int y);
}
