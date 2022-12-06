package com.unitedcoder.homework;

public class W7D3Shapes {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= Math.pow(2, i); j++) {
                System.out.print("[]");
            }
            System.out.println();
        }
        System.out.println("----------------");
        for (int row = 1; row <= 8; row++) {
            {
                for (int column = 1; column <= row; column++) {
                    if (row % 2 == 0) {
                        if (row == 6) {
                            row += 2;
                        }
                        System.out.print("[]");
                    }
                }
                System.out.print("\n");
            }
        }
        System.out.println("---------");
        for (int i=1;i<5;i++){
            if (i==3)
                continue;
            for (int j=1;j<=i*2;j++){
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}