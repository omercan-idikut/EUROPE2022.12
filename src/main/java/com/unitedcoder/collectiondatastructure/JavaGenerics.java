package com.unitedcoder.collectiondatastructure;

import java.util.ArrayList;

public class JavaGenerics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(90);
        list.add(200);
        list.add(300);
        for (Object a : list) {
            System.out.println((Integer) a * 2);
        }
    }
}
