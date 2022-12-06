package com.unitedcoder.exceptionhandling;

public class ExeptionHandlingDemo4 {
    public static void main(String[] args) {
        try {
            String s = "A123";
            int x = Integer.parseInt(s);
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }
        finally {
        System.out.println("Java Exception");
    }
  }
}
