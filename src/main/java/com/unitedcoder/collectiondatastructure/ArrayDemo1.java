package com.unitedcoder.collectiondatastructure;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //integer array, fixed length
        int[] arr=new int[12]; //can store 12 value/element
        arr[0]=10;     arr[1]=25;
        arr[2]=15;     arr[3]=20;
        arr[4]=200;     arr[5]=880;
        arr[6]=40;     arr[7]=50;
        arr[8]=206;     arr[9]=90;
        arr[10]=89;     arr[11]=2100;
        System.out.println(arr[8]);
        System.out.println(arr[11]);
        System.out.println(arr.length);
       // for (int i=0;i<12;i++){
            //System.out.print(arr[i]+" ");
            for (int i=0;i<=arr.length-1;i++){//0-12
                System.out.print(arr[i]+" ");
        }
            System.out.println();
            //for each loop
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}
