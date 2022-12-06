package com.unitedcoder.javamethodtutorial;

import org.apache.commons.lang3.StringUtils;

public class Calculator {
    //method for print calculator information  non static method
    public void calCulatorInfo() {
        System.out.println("Simple Calculator");
        System.out.println("Hope you enjoy to usue!!!");
    }

    //method for add two numbers
    public int sum(int i1, int i2) {
        return i1 + i2;
    }

    public long addTwoNumbers(String s1, String s2) {
        if (StringUtils.isNumeric(s1) && StringUtils.isNumeric(s2)) {
            long sum = Long.parseLong(s1) + Long.parseLong(s2);
            return sum;
        } else {
            System.out.println("Please provide numeric string!!");
            return 0;
        }
    }

    //add multiple numbers
    public long addMultipleNumbers(long... numbers) {
        long sum = 0;
        for (long eachNumber : numbers) {
            sum += eachNumber;
        }
        return sum;
    }
}
