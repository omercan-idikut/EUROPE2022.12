package com.unitedcoder.conditions;

public class LogicalOperatorAndBitwiseOperators {
    public static void main(String[] args) {
        //&& &
       boolean b1=false;
               int number =200;
               if (b1&&(number++>0)){
               }
               else {
                   System.out.println("false");
               }
        System.out.println("Value of number is:"+number);
               int number1=300;
               if (b1&(number1++>0)){
                   System.out.println("True");
        }
               else {
                   System.out.println("false");
               }
        System.out.println("Value of number is:"+number1);
    }
}
