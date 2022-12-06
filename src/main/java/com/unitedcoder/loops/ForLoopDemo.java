package com.unitedcoder.loops;

public class ForLoopDemo {
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        //1000-1 starting 1000 condition i<=1--
        for (int i=1000;i>=1;i--){
            System.out.print(i+ " ");
        }
        System.out.println();
        //0-100 jup san 0-<=100 +2
        for (int j=0;j<=100;j=j+2){
            System.out.print(j+ " ");
        }
        System.out.println();
        for (int j=0;j<=100;j++){
            if (j!=0&&j%2==0){
                System.out.print(j+ " ");
            }
        }
    }
}
