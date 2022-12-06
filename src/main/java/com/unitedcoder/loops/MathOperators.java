package com.unitedcoder.loops;

import java.util.Random;

public class MathOperators {
    public static void main(String[] args) {
        int i1=100;
        System.out.println(Math.max(100,150));
        System.out.println(Math.min(20,400));
        System.out.println(Math.abs(-90));
        System.out.println(Math.pow(3,4));
        //Radom   range  0.0---0.9999999
        System.out.println(Math.random());
        //0-10
        int randomNumbers=(int) (Math.random()*11)+1;
        //1+Math.random(); 1.0-1.999999999
        System.out.println(randomNumbers);

        //Random Class
        Random random=new Random();
        System.out.println(random.nextInt());


    }
}
