package com.unitedcoder.datatypes;

public class ArithmaticOperators {
    public static void main(String[] args) {
        //+  -  *  /  %  ++  --
        //Premier of Rectange  w+h *2  h*w
        int width=45;
        int heigh=25;
        int area=width*heigh;
        int premier=(width+heigh)*2;
        System.out.println("Area of rectange is: "+area);
        System.out.println("Premier of rectange is: "+premier);

        float division= (float)width/heigh;
        System.out.println(division);

        System.out.println(5%3);//2
        System.out.println(9%8);//1

        //Increment & Decrement ++  --
        int i=2;
        int j=1;
        i++;//3
        j++;//2
        System.out.println(i);
        System.out.println(j);
        i++;//4  post increment
        j--;//1
        j--;//0
        ++i;//pre increment
        --j;
        System.out.println(i);
        System.out.println(j);
        i=i+2;
        j=j+2;
        System.out.println(i);
        System.out.println(j);




    }
}
