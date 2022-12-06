package com.unitedcoder.oopsconcept.polymorphism;

public class MethodOverloading {
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void sum(double a, int b) {
        System.out.println(a + b);
    }

    public void sum(double a, float b) {
        System.out.println(a + b);
    }
}
