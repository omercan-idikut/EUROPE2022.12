package com.unitedcoder.homework;

public class W7D3Divisible3515 {
    public static void main(String[] args) {
        //Write a Java program that prints out how many numbers between 1 and 500 divisible by 3,or 5, or 15 with zero remainder.
        int sum = 0;
        for (int i = 1; i <= 500; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 15 == 0) {
                sum++;
            }
        }
        System.out.println(sum);
        //1.You need to print all the numbers that can be divided by 3 on the console;
        int count1=0;
        for (int i = 1; i <= 500; i++) {
            if (i % 3 == 0) {
                count1++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Numbers divide by 3 is: "+count1);
        System.out.println();
        //2. You need to print all the numbers that can be divided by 5 on the console.
        int count2=0;
        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0) {
                count2++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Numbers divide by 5 is:"+count2);
        System.out.println();
        //3. You need to print all the numbers that can be divided by 15 on the console.
        int count3=0;
        for (int i = 1; i <= 500; i++) {
            if (i % 15 == 0) {
                count3++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Numbers divide by 15 is:"+count3);
    }
}