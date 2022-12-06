package com.unitedcoder.cubecartautomation;

enum level{
    Low,Medium,High
}
public class TestEnum {
    public static void main(String[] args) {
        System.out.println(level.High);
        level l=level.High;
        switch (l){
            case Low:
                System.out.println("Low level");
                break;
            case Medium:
                System.out.println("Medium level");
                break;
            case High:
                System.out.println("High level");
                break;
        }
    }

}
