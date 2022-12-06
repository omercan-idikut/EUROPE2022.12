package com.unitedcoder.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class W8D2MapProject {
    public static void main(String[] args) {
        Map<String,String> cities=new HashMap<>();
        cities.put("MD","Marryland");
        cities.put("VA","Virginia");
        cities.put("NY","New York");
        Set<String> keys=cities.keySet();
        int count=0;
        for (String k:keys){
            System.out.println(k+":"+cities.get(k));
            count++;
        }
        System.out.println("Number of keys:"+count);
        System.out.println();

        //keySet
        Set<String> c=cities.keySet();
        System.out.println(keys);

        for (Map.Entry entry: cities.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

    }
}
