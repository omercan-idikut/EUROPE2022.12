package com.unitedcoder.datatypes;

public class PrePostIncrementAndDecrement {
    public static void main(String[] args) {
        //Post increment--  first execute the operation and then plus one
        //Pre increment-- first plus one and then execute operation

        int a=30;
        int b=50+(++a);
        int c=++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int a1=30;
        int b1=50+(a1++);
        int c1=a1++;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);

        //Pre decremennt
        //Post decrement
        System.out.println("---------");
        int x1=10;
        int y1=--x1;//Assignment
        System.out.println(x1);//9
        System.out.println(y1);//9

        int x2=20;
        int y2=(x2--)+90;
        int y3=(--x2)-20;
        int y4=--y3;
        int y5=y4--;
        System.out.println(x2);//18
        System.out.println(y2);//110
        System.out.println(y3);//-3
        System.out.println(y4);//-4
        System.out.println(y5);//-3
        System.out.println(00000);
        int w=30;
        int q=(++w)+20;
        int q1=(--w)+15;
        int q2=w;
        System.out.println(w);//30
        System.out.println(q);//51
        System.out.println(q1);//45
        System.out.println(q2);//30

    }
}
