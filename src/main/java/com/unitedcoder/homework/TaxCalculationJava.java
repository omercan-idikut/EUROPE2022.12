package com.unitedcoder.homework;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class TaxCalculationJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your satatus:");
        //Enter tax filling status from the console
        String status = scanner.next();
        if (status.equalsIgnoreCase("Single")) {
            System.out.println("Please enter your annual salary:");
            //Enter the anuual salary from the console
            String inputSalary = scanner.next();
            if (StringUtils.isNumeric(inputSalary)) {
                double annualSalary = Double.parseDouble(inputSalary);
                double tax1 = annualSalary * 0.1;//for single && 0-32000
                double tax2 = 32000 * 0.1 + (annualSalary - 32000) * 0.25;//for single && >32000
                if (0 <= annualSalary && annualSalary <= 32000) {
                    System.out.println("You're single and your annual salary is between $0-$32000 ," +
                            "so you have to pay 10% tax:" + tax1 +
                            "\nYour annual salary wll be:" + (annualSalary - tax1));
                } else if (annualSalary > 32000) {
                    System.out.println("You're single and your annual salary is over$32000" +
                            "so you have to pay 10% tax for 32000$,and 25% tax for the amount out of range " +
                            "Your tax will be :" + tax2 +
                            "\nYour annual salary will be:" + (annualSalary - tax2));
                }
            } else System.out.println("Please enter the digit salary");
        } else if (status.equalsIgnoreCase("Married")) {
            System.out.println("Please enter your annual salary: ");
            String inputSalary = scanner.next();
            if (StringUtils.isNumeric(inputSalary)) {
                double annualSalary = Double.parseDouble(inputSalary);
                double tax1 = annualSalary * 0.1;//for married && 0-64000
                double tax2 = 64000 * 0.1 + (annualSalary - 64000) * 0.25;//for married && >64000
                if (0 <= annualSalary && annualSalary <= 64000) {
                    System.out.println("You're married and your annual salary is between $0-$64000, " +
                            "so you have to pay 10% tax :" + tax1 +
                            "\nYour annual salary will be:" + (annualSalary - tax1));
                } else if (annualSalary > 64000) {
                    System.out.println("You're married and your annual salary is over $64000," +
                            "so you have to pay 10% tax for $64000,and 25% tax for amount out of range," +
                            "Your tax will be:" + tax2 +
                            "\nYour annual salary will be:" + (annualSalary - tax2));
                }
            } else {
                System.out.println("Please enter the digit salary");
            }
        } else {
            System.out.println("Please enter the correct status");
        }
    }
}