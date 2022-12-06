package com.unitedcoder.conditions;

import java.util.Scanner;

public class StudentGradeDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your score between 0-100!!");
        int score=input.nextInt();
        if(score>=90&&score<=100){
            System.out.println("Great!!Godd job!! yur grade is 'A'!! You win an Ipad!!");
        }
        else if(score>=80&&score<90){
            System.out.println("Good Job!!!Your Grade is 'B', you win an Iphone!!!");
        }
        else if(score>=70&&score<80){
            System.out.println("Your Grade is 'C'!");
        }
        else if(score>=60&&score<70){
            System.out.println("Your Grade is 'D'");
        }
        else {
            System.out.println("You failed the exam, Please work hard!!");
        }
    }
}
