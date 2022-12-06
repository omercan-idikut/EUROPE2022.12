package com.unitedcoder.collectiondatastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(60);       list1.add(80);
        list1.add(90);       list1.add(100);

        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(list1);
        ListIterator<Integer> it=list2.listIterator(3);
        while (it.hasPrevious()){
            System.out.print(it.previous()+" ");
        }

            }
            }


