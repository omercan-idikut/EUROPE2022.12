package com.unitedcoder.lambdaandstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<Integer>list1= Arrays.asList(100,90,10,20,5,40,50);
//        for (int l:list1){
//            if (l%2==0)
//                System.out.println(l);
//        }
        list1.stream().filter(s->s%2==0).forEach(s-> System.out.println(s));
        System.out.println("------");
        list1.stream().filter(s->s%2==0).filter(s->s>20).forEach(s-> System.out.println(s));
        List<String> customerList=Arrays.asList("Tom","David","Arzugul","Abdullah");
        customerList.stream().filter(a->a.length()>3&&a.length()<8).forEach(System.out::println);
        List<String> names=customerList.stream().filter(a->a.startsWith("A")).collect(Collectors.toList());
        System.out.println(names);

    }
}
