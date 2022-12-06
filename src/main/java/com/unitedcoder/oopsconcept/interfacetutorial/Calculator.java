package com.unitedcoder.oopsconcept.interfacetutorial;



public class Calculator implements SimpleCalculator , IScientificCalculator {
    @Override
    public double addTowNumbers(int a, int b) {
        return a+b;
    }

    @Override
    public double addTwoNumbers(int a, int b) {
        return 0;
    }

    @Override
    public int addMultipleNumbers(int... numbers) {
        int sum = 0;
        for (int n:numbers){
            sum+=n;
        }
        return sum;
    }

    @Override
    public double multipleytwoNumbers(double d1, double d2) {
        return d1*d2;
    }

    @Override
    public float divideTwoNumbers(double x, double y) {
        return 0;
    }

    @Override
    public long subtractNumbers(long l1, long l2) {
        return 0;
    }

    @Override
    public void printCalculatorInfo() {

    }

    @Override
    public double multiplytwoNumbers(double d1, double d2) {
        return d1 * d2;
    }

    @Override
    public float divideTowNumbers(double x, double y) {
        if (y == 0){
            System.out.println("The denominator can not be zero !!!");
            return 0;
        }
        else {
            float division = (float) (x / y);
            return division;
        }

    }

    @Override
    public long subtractTwoNumbers(long l1, long l2) {
        return l1 - l2;
    }

    @Override
    public double calculatePower(int base, int power) {
        return Math.pow(base , power);
    }

    @Override
    public double calculateSquareRoot(long l) {
        return Math.sqrt(l);
    }

    @Override
    public double calculateAbsoluteValue(int x) {
        return Math.abs(x);
    }

    @Override
    public double minValue(int x, int y) {
        return Math.min(x,y);
    }
}