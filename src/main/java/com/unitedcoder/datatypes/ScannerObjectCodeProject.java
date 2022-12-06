package com.unitedcoder.datatypes;


import java.util.Scanner;

public class ScannerObjectCodeProject {
    public static void main(String[] args) {
        //Scanner homework
        //What is your name?
        //What is your house street address?
        //What is the name of the city?
        //What is the state?
        //After all the above questions are answered, you need to print out the full address
        Scanner input=new Scanner(System.in);
        System.out.println("What is yor name?");
        String name=input.nextLine();
        System.out.println("What is your house street address?");
        String streetAddress=input.nextLine();
        System.out.println("What is the name of the city?");
        String cityName=input.nextLine();
        System.out.println("What is the state?");
        String stateName=input.nextLine();
        System.out.printf("My full address is: \t%s\t%s\t%s\n%s\t",name,streetAddress,cityName,stateName);

    }
}
