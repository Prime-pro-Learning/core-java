package com.corejava;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>(); //?
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add(2,"str4");
    }
}
