package com.unitedcoder.datatypes;

public class DataTypeDemo1 {
 //Code block
 public static void main(String[] args) {
     //byte data type
     byte b1=20;
     System.out.println(b1);
     b1=120;
     System.out.println(b1);
     b1=120;//Variable
     System.out.println("b1 Value After Change: "+b1);
     //short
     short s1=1000;
     System.out.println(s1);
     short s2=2000;
     System.out.println("Short Min Value"+Short.MIN_VALUE);
     System.out.println("Short Max Value"+Short.MAX_VALUE);
     //compile error Run time error
     int s3=s1+s2;
     //int vs long
     int i1=2000;
     int i2=3000;
     long l1=20000000000l;
     //double vs float
     float f1=123.76545f;
     double d1=7865.8976543;
     double d2=100;
     float f2=98;

     System.out.println(f1);
     System.out.println(d1);
     System.out.println(d2);
     System.out.println(f2);

     //boolean

     boolean b2=true;
     boolean b3=false;
     System.out.println("10 greater than 20 is:"+b3);
     System.out.println("Login Test Pssed!"+b2);

     //char
     char c1='A';
     char c2='c';
     System.out.println(c1);
     System.out.println(c2);
     //ASCII code value
     int value1=c1;
     int value2=c2;
     char c3=66;
     System.out.println(value1);
     System.out.println(value2);
     System.out.println(c3);
     byte a1=127;
     byte a2=-128;
     System.out.println(a1&a2);







 }





}
