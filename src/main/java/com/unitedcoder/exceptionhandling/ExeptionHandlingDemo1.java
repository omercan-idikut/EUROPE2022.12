package com.unitedcoder.exceptionhandling;

public class ExeptionHandlingDemo1 {
    public static void main(String[] args) {
        try { //try block
            int[] a = {1, 3,4, 5, 6};
            System.out.println(a[3]);
        }
        catch (Exception e) { //catch block
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Hello World");
        }
        System.out.println("After Catch");
    }
}