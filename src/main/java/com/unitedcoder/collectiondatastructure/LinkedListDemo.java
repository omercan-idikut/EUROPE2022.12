package com.unitedcoder.collectiondatastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        List<Integer> list=new LinkedList<>();
        Queue<Integer> list2=new LinkedList<>();

        linkedList.add(60);    linkedList.add(80);
        linkedList.add(90);    linkedList.add(100);
         linkedList.addFirst(200);
         linkedList.addLast(400);
        System.out.println(linkedList);
        Iterator<Integer> it=linkedList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
