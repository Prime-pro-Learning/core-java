package com.corejava;

import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        /*LinkedHashSet<Character> set=new LinkedHashSet<>(25,0.65f);
        set.add('Z');
        set.add('A');
        set.add('F');
        set.add('Q');
        set.add('L');
        System.out.println(set);*/
        /*TreeSet<String> set=new TreeSet<>();
        set.add("ABC");
        set.add("XYZ");
        set.add("ASD");
        set.add("QWE");
        set.add("ZXC");
        set.add("LKJ");*/
        TreeSet<Person> set=new TreeSet<>();
        set.add(new Person("user1","password","ram"));
        set.add(new Person("user1","password","kumar"));
        set.add(new Person("user1","password","Ramesh"));
        set.add(new Person("user1","password","raju"));
        set.add(new Person("user1","password","Suresh"));
        System.out.println(set);


    }
}
