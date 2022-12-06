package com.unitedcoder.classconcepts;

public class NestedClassDemo {//outer class

    public static void main(String[] args) {
        NestedClassDemo nestedClassDemo = new NestedClassDemo();
        nestedClassDemo.sum(100, 200);
        NestedClassDemo.InnerClass1 innerClass1 = new NestedClassDemo().new InnerClass1();
        innerClass1.sum1(200, 900);
        InnerClass2 innerClass2 = new InnerClass2();
        innerClass2.multiplication(10, 20);
    }

    public void sum(int x, int y) {
        System.out.println(x + y);
    }

    //non satatic inner class
    class InnerClass1 {
        private int sum1(int a, int b) {
            System.out.println(a + b);
            return a + b;
        }
    }

    //static inner class
    static class InnerClass2 {
        private long multiplication(int a, int b) {
            System.out.println(a * b);
            return a * b;
        }
    }
}
    class Test1 {
        public static void main(String[] args) {
            NestedClassDemo n = new NestedClassDemo();
            n.sum(800, 600);
        }
    }

    class Test2 {

    }
