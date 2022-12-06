package com.unitedcoder.lambdaandstream;
@FunctionalInterface
public interface LambdaFunctions {
    void read();
        static void write(){
    }
    default void say() {
    }
    }
    class Test{
        public static void main(String[] args) {
        LambdaFunctions functions=()-> System.out.println("I am readng a Book");
        functions.read();
    }
}


