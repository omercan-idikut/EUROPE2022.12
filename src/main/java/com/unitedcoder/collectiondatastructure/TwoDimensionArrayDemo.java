package com.unitedcoder.collectiondatastructure;

public class TwoDimensionArrayDemo {
    public static void main(String[] args) {
        int[][] a1=new int[4][];
        //int[] a2[]={};
        int[][] array= {
                {1,2,3},
                {6,9,10,70},
                {30,90},
                {20,80,30,5,8,10}
        };
        System.out.println(array.length);
        System.out.println(array[1].length);
        System.out.println(array[3].length);
        System.out.println(array[1][1]);//9
        System.out.println(array[3][2]);//30
        System.out.println(array[2][1]);//90
        int sum=0;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
                sum+=array[i][j];

            }
            System.out.println();
            System.out.println("Each sum: "+sum);
        }
        System.out.println("Sum of array: "+sum);
    }
}
