package com.unitedcoder.collectiondatastructure;

public class ArrayDemo2 {
    public static void main(String[] args) {

        int[] a = new int[]{20, 40, 50, 60, 70, 76, 89, 75100};
        int[] b={19,73,445,6,78,9,6,};
        System.out.println(a[5]);
        System.out.println(a.length);
        System.out.println(b.length);
        System.out.println(b[4]);

        int sum=0;
        for (int i=0;i<b.length;i++){
            sum+=b[i];
        }
        System.out.println(sum);
        //for each loop
        int sum1=0;
        for (int r:b){
            sum1+=r;
            System.out.println(r);
        }
        System.out.println(sum1);

    }
}
