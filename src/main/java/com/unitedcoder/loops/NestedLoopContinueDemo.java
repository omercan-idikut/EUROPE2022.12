package com.unitedcoder.loops;

public class NestedLoopContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 4 == 0) {
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.println();
            //break;
        }
        System.out.println("Continue Demo");
        //continue demo
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 4 == 0) {
                    continue;
                }
                System.out.print(j + " ");
            }
            System.out.println();
            System.out.println(i);
        }
    }
}
