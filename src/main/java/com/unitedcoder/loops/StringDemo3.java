package com.unitedcoder.loops;

public class StringDemo3 {
    public static void main(String[] args) {
        String result=" All Test Passed ";
        System.out.println(result.length());//17
        System.out.println(result.trim().length());//15
        result=result.replace(" ","");
        System.out.println(result.length());//13

        //String format
        String course="United  Coder";
        String course1="Selenium Master";
        String course2="Java Selenium Course";
        //Welcome to ...
        System.out.println("Welcometo "+course);
        System.out.println(String.format("Welcome to %s",course1));
        System.out.println(String.format("Wlcome to %s",course2));
        int i1=100;
        int i2=200;
        int i3=i1+i2;
        System.out.println(i1+i2);
        System.out.println(String.format("I am learning Arithmatic operation Plus in %s: %d + %d =%d",course,i1,i2,i3));
        System.out.println(String.format("%d +%d =%d\n",i1,i2,i3));
        System.out.printf("%d+%d=%d\n",i1,i2,i3);
        System.out.println(String.format("%d+`%d=%d\n",i1,i2,i3));

        System.out.println("**********");

        boolean b1=true;
        boolean b2=false;

        System.out.println(String.format("Login Test Passed %b",b1));
    }
}
