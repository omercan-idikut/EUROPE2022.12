package com.unitedcoder.homework;

import java.util.Random;
import java.util.Scanner;

public class JavaDataTypeCodingProject {
    public static void main(String[] args) {
        //int no1=100;
        //int no2=50;
        int no1 = 0;
        int no2 = 0;
        int no3 = no1 + no2;
        int no4 = no2 - no1;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Please enter no1");
        Scanner scanner = null;
        no1=scanner.nextInt();
        System.out.println("Please enter no2");
        no2 = scanner.nextInt();
        //the sum of the two numbers
        System.out.println(String.format("sum of two number is: %d+%d=%d", no1, no2, no3));
        //the difference of the two numbers
        System.out.println(String.format("the difference of the two number is:%d-%d=%d", no1, no2, no2 - no1));
        //The product (multiplication) of the two numbers
        System.out.println(String.format("the multipication of two number is:%d*%d=%d", no1, no2, no1 * no2));
        //The average of the two numbers
        System.out.println(String.format("the avarage of two number is:%d+%d/2=%d", no1, no2, (no3) / 2));
        //The absolute values of the two number differences
        System.out.println(String.format("The absolute values of the two number difference is:" + Math.abs(no4)));
        //the maximum of the two numbers
        System.out.println(String.format("the maximum of the two numbers is:" + Math.max(no1, no2)));
        //The minimum of the two numbers;
        System.out.println(String.format("The minimum of the two number is:" + Math.min(no1, no2)));
        //The comparison of the two numbers
        //if (s1==s2)
        //System.out.println("%d==%d\n",s1,s2);
        //else if(s1!=s2)
        //System.out.println("%d!=%d\n",s1,s2);
        //if(s1<s2)
        //System.out.println("%d<%d\n",s1,s2);
        // if (s1>s2)
        //System.out.println("%d>%d\n",s1,s2);
        //if(s1<=s2)
        //System.out.println("%d<=%d\n",s1,s2);
        //if(s1>=s2)
        //System.out.println("%d>=%d"\n,s1,s2);
        boolean s5 = no1 == no2;
        boolean s6 = no1 >= no2;
        boolean s7 = no1 <= no2;
        boolean s8 = no1 != no2;
        boolean s9 = no1 > no2;
        boolean s10 = no1 < no2;
        System.out.println(String.format("compare two number is:%d==%d =%b", no1, no2, s5));
        System.out.println(String.format("%d>=%d =%b", no1, no2, s6));
        System.out.println(String.format("%d<=%d =%b", no1, no2, s7));
        System.out.println(String.format("%d!=%d =%b", no1, no2, s8));
        System.out.println(String.format("%d>%d =%b", no1, no2, s9));
        System.out.println(String.format("%d<%d =%b", no1, no2, s10));

    }
}
