package com.unitedcoder.collectiondatastructure;

public class SplitDemo {
    public static void main(String[] args) {
        String school="United_Coder";
        String s="Hello,World";

        String[] array1=school.split("_");
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        for (String a:array1){
            System.out.println(a);
        }
        String[] s1=s.split(",");
        for (String b:s1){
            System.out.println(b);
        }
    }
}
