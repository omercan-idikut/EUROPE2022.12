package com.unitedcoder.oopsconcept.interfacetutorial;


public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println(calculator.addTowNumbers(100,200));
        System.out.println(calculator.calculatePower(3,2));
        System.out.println(calculator.calculateAbsoluteValue(-20));
        System.out.println(calculator.divideTowNumbers(10,2));
        System.out.println(calculator.calculateSquareRoot(64));
        System.out.println(calculator.minValue(20,50));
        System.out.println(calculator.multipleytwoNumbers(20,40));
    }
}
