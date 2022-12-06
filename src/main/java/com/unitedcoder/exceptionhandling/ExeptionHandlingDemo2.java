package com.unitedcoder.exceptionhandling;

public class ExeptionHandlingDemo2 {
    public static void main(String[] args) throws InterruptedException {
        wait(3);
        sleep(4);
    }

    public static void sleep(int second) throws InterruptedException {
        Thread.sleep(second * 1000);
    }

    public static void wait(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
