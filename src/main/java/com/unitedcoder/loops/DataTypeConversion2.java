package com.unitedcoder.loops;

public class DataTypeConversion2 {
    public static void main(String[] args) {
        //convert Stirng to primitive data type
        String s1="25";//Numeric string
        String price1="100$";
        String price2="110$";
        String price3="140$";
        int expectedTotalPrice=350;
        int i1=Integer.parseInt(s1);
        System.out.println(s1+100);
        System.out.println(String.format("Value after conversion is %d",(i1+100)));;
        price1=price1.replace("$","");
        int p1=Short.parseShort(price1);
        System.out.println(p1);
        price2=price2.replace("$","");
        int p2=Integer.parseInt(price2);
        price3=price3.replace("$","");
        int p3=Integer.parseInt(price3);
        int totalSumPrice=p1+p2+p3;
        System.out.println(expectedTotalPrice==totalSumPrice);

        String s2="true";
        boolean b1=Boolean.parseBoolean(s2);
        System.out.println(b1);

        //Convert primitive data type to String
        int i2=10000;
        int i3=9000;
        System.out.println(i2+i3);
        String s3=String.valueOf(i2);
        String s4=String.valueOf(i3);
        System.out.println(s3+s4);

    }
}
