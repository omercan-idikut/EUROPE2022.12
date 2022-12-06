package com.unitedcoder.loops;

public class ForLoopDemo2 {
    public static void main(String[] args) {

      //1-10 sum
        int sum=0;
      for (int i=1;i<=10;i++){
          sum+=i; //sum=sum+i
          System.out.printf("i=%d sum=%d\n",i,sum);
      }
        System.out.println("Total Sum:"+sum);
      // 1-5 factorial 1*2*3*4*5
        int factorial=1;
        for (int i=1;i<=5;i++){
            factorial*=i; //factorial=factorial*i;
            System.out.printf("i=%d factorial=%d\n",i,factorial);
        }
        System.out.println("Factorial:"+factorial);
        //count even number
        int evenNumberCounts=0;
        for (int j=0;j<=100;j++) {//j 0-100
            if (j !=0 && j % 2==0){
              //  System.out.println(j + " ");
                evenNumberCounts++;
            }
        }
        System.out.println("Total even number is:"+evenNumberCounts);

    }
}
