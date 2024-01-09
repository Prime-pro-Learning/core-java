package com.corejava;

public class StaticDemo {
    static int a=42; //
     int b=99; //non static
    static void callme(){
        System.out.println("a value: "+ a);
    }

    public static void main(String[] args) {
        //callme();
        //StaticDemo.callme();
    }
}
