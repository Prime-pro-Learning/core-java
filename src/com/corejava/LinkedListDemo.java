package com.corejava;

import java.util.LinkedList;
import java.util.Vector;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>(); //?
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str3");
        list.add(2,"str4");
        String s = list.get(3);
        System.out.println(s);
        Vector<String> strings=new Vector<>();
        strings.add("test");
        System.out.println(list);
    }
}
