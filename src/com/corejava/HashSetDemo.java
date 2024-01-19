package com.corejava;

import java.util.HashSet;
import java.util.List;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Double> set=new HashSet<>();//16
        //System.out.println(set.size());
       // System.out.println(set.isEmpty());
        set.add(45.63);
        set.add(85.74);
        set.add(85.45);
        set.add(58.74);
        set.add(96.41);
       // System.out.println(set.contains(96.74));//
       // List<Double> doubles = List.of(45.63, 74.96, 85.23);
       // System.out.println("retainAll method:"+set.retainAll(doubles));
        /*Object[] array = set.toArray();
        System.out.println(array);
        System.out.println(set.size());
        System.out.println(set.isEmpty());*/
        System.out.println(set);
    }
}
