package com.unitedcoder.loops;

public class NestedLoopDemo {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int column = 5; column >= row; column--) { //5-1 5-2 5-3 5-4 5-5
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("****************");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("*************");
        for (int i=1;i<=5;i++){
            int j=1;
            while (j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
        }
        System.out.println("****************");
        for (int i=1;i<=5;i++) {
            int j = 1;
            do {
                System.out.print("* ");
                j++;
        }while (j<=i);
            System.out.println();
        }
    }
}