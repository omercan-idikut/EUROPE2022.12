package com.unitedcoder.homework;
import java.util.Scanner;

public class W7D3PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number: ");
        int number = scanner.nextInt();
        System.out.println("The prime numbers between 1 to " + number + " are");
        for (int i = 2; i < number; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("**********");

        for (int i = 1; i < number; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i !=j){
                    break;
                }
                if (i % j == 0 && i == j) {
                    System.out.print(i+" ");
                }
            }
        }
    }
}
