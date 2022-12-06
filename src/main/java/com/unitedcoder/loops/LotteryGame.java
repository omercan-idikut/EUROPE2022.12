package com.unitedcoder.loops;

import java.util.Random;
import java.util.Scanner;

public class LotteryGame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); //define an input object instance
            int winCounnts=0;
            int totalGames=10;
            for(int i=1;i<=totalGames;i++)
            {
                System.out.print("Enter your lottery number: ");
                Random random=new Random();
                int lotteryNumber=random.nextInt(10);
                int yourNumber=scanner.nextInt();
                System.out.println(String.format("Lottery Number= %d , Your number=%d",lotteryNumber,yourNumber));
                if(lotteryNumber==yourNumber)
                {
                    System.out.println("You won the lottery");
                    winCounnts++;
                }
                else {
                    System.out.println("Try again, you lost");
                }
                System.out.println(String.format("Remaining game count: %d ",totalGames-i));
            }
            System.out.println("Your total win is "+winCounnts);
        }
    }

