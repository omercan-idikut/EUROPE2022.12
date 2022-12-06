package com.unitedcoder.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class W8D3JavaArraySortExercise {
    public static void main(String[] args) {
        //Generate 10 random numbers from 10 to 100
        //Assign the numbers to an array
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90 + 10);
        }
        System.out.println(Arrays.toString(arr));

        //Sort the numbers in the ascending order and print out
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //Sort the numbers in the descending order and print out
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");

            }
        }
    }
