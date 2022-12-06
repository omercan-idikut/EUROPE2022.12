package com.unitedcoder.conditions;

import java.util.Scanner;

public class ConditionalStatementDemo1 {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        int number1=number.nextInt();
        int number2=number.nextInt();
        //if
        if (number1>number2) {//boolean data type
            //if block
            System.out.printf("%d is greater than %d",number1,number2);
            //System.out.println("**************");
        }
        else {
            System.out.printf("%d is less then %d",number1,number2);//else block
        }
    }
}