package com.unitedcoder.collectiondatastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetAndHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> hashSet=new HashSet<>();
        hashSet.add(50);         hashSet.add(30);
        hashSet.add(70);         hashSet.add(40);
        hashSet.add(60);         hashSet.add(100);
        System.out.println(hashSet);

        Set<Integer>linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(70);         linkedHashSet.add(40);
        linkedHashSet.add(80);         linkedHashSet.add(60);
        linkedHashSet.add(90);         linkedHashSet.add(30);
        System.out.println(linkedHashSet);

        Set<Integer> treeSet=new TreeSet<>();
        treeSet.add(200);             treeSet.add(100);
        treeSet.add(90);             treeSet.add(60);
        treeSet.add(50);             treeSet.add(150);
        System.out.println(treeSet);

        Set<String> treeSet1=new TreeSet<>();
        treeSet1.add("Banana");
        treeSet1.add("Grape");
        treeSet1.add("Aplle");
        treeSet1.add("Mango");
        System.out.println(treeSet1);

    }
}
