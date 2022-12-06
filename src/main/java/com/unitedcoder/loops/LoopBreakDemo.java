package com.unitedcoder.loops;

public class LoopBreakDemo {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 10; i++) {
            if (i == 4) {
                System.out.println(i);
                break;
            }
        }
        System.out.println("Final Value: "+i);

        for (int j=1;i<10;j++){
            if (j%4==0){
                break;
            }
            System.out.println(j);
        }
    }
}