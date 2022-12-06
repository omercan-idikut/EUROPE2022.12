package com.unitedcoder.homework;
public class week5day1project {
    public static void main(String[] args) {

        //Java Code Project
        String schoolName = "United Coder";
        String schoolAddress = "8958 State Route 108, Suite 219,Columbia,USA,MO";
        String zipCode = "21046";
        //1.combine school name, address, and zip code together and store it with a String variable named "schoolFullAddress".
        String schoolFullAddress = schoolName + schoolAddress + zipCode;
        System.out.println(schoolFullAddress);
        //2.print school name with all Capital letters.
        System.out.println(schoolName.toUpperCase());
        //3.print school address with all lower case letters
        System.out.println(schoolAddress.toLowerCase());
        //4.from schoolFullAddress, print out only the zip code.
        System.out.println(schoolFullAddress.substring(59,64));
        //5.print out total length of the schoolFullAddress String variable
        System.out.println(schoolFullAddress.length());
        //6.print out the result if your school name equals to "University".
        System.out.println(schoolName.equals("University"));
        //7.print out the result if your school name contains a char 'S'.
        System.out.println(schoolName.contains("s"));
        //8.Use String.format to print out your school full address
        System.out.println(String.format("%s,%s,%s",schoolName,schoolAddress,schoolFullAddress));
        System.out.println(String.format("My school full address is:%S,%S,%S",schoolName,schoolAddress,schoolFullAddress));

        //Java program
        String index=String.format("*");
        System.out.println("*");
        String index2=String.format("**\n");
        System.out.println("**");
        String index3=String.format("***\n");
        System.out.println("***");
        String index4=String.format("****");
        System.out.println("****");
        String index5=String.format("*****");
        System.out.println("*****");
        System.out.println("*\n,**\n,***\n,****\n,*****\n");


    }

}

