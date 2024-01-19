package com.corejava;

import java.util.*;

public class CollectionDemo {
    void test(String str){

    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(45); //0
        list.add(55); //1
        list.add(65);//2
        list.add(75);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(96);
        list2.add(86);
        list.addAll(list2);
        //list.addAll(4,list2);
       // list.removeAll(list2);
        list.retainAll(list2);

        //test(45);
        /*System.out.println(list.contains(75));
        *//*list.add(0,45);
        list.add(1,55);//*//*
        System.out.println(list);
        System.out.println("List remove():"+ list.remove(2)); //lis)t
        System.out.println("Collection remove(): "+list.remove("75")); //Collection
        System.out.println(list);
        //System.out.println(list.remove(85));
        System.out.println(list.size());//
        System.out.println(list.isEmpty());//true*/
        //list.add(0,10);
        //int arr[]={1,2,3,4,5,6,7,8,9,10};
        /*int arr[]={};
        System.out.println(arr.length);*/

    }
}
