package com.unitedcoder.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class W8D2JavaArrayProject {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        Random random=new Random();
        int evenNumberCount=0;
        int oddNumberCount=0;
        int dividedby3=0;
        float sum=0;
        for (int i=0;i<30;i++){
            int r=random.nextInt(100)+1;
            arrayList.add(r);
            if (r % 2==0){
                evenNumberCount+=1;
                }
            if (r % 2 !=0){
                oddNumberCount+=1;
            }
            if (r %3==0){
                dividedby3+=1;
            }
            sum+=arrayList.get(i);
            }
        System.out.println("30 random numbers between1 and 100");
        System.out.println(arrayList);
        System.out.println("The total even numbers count"+evenNumberCount);
        System.out.println("The total odd numbers count"+oddNumberCount);
        System.out.println("The count of numbers divided by 3 is: "+dividedby3);
        System.out.println("The sum of the 30 random numbers "+sum);
        System.out.println("The avarage of the 30 random numbers "+sum/30);
        Collections.sort(arrayList);
        System.out.println("The numbers sorted in accending order");
        System.out.println(arrayList);
        System.out.println("The numbers sorted by descending order");
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        }
    }

