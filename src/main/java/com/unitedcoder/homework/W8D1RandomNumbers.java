package com.unitedcoder.homework;

import java.util.Random;
import java.util.Scanner;

public class W8D1RandomNumbers {
    public static void main(String[] args) {
        Random random=new Random();
        double sum=0;
        int totalNumbers;
        for (totalNumbers=1;totalNumbers<=5;totalNumbers++){
            int randomNumber= random.nextInt(50);
            sum+=randomNumber;
            System.out.println(randomNumber);
        }
        double avarage=sum/totalNumbers;
        System.out.println("Your avarage is: "+avarage);
    }
}
