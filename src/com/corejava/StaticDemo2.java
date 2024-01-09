package com.corejava;

public class StaticDemo2 {
    static int a=45;
    int b=78;

    public StaticDemo2() {
        System.out.println("default constructor");
    }

    static{
        System.out.println("static block a value: "+ a);
        //System.out.println("b value: "+ b);
    }{
        System.out.println("instance block a value: "+ a); // error
        System.out.println("instance block b value: "+ b); // error
    }
    static void staticMethod(){
        System.out.println("static method a value: "+ a);
        //System.out.println("b value: "+ b); // error
    }
    void nonStaticMethod(){
        System.out.println("non static method a value: "+ a); //error
        System.out.println("non static method b value: "+ b);
    }

    public static void main(String[] args) {
        StaticDemo2 staticDemo2=new StaticDemo2();
        /*StaticDemo2 staticDemo2=new StaticDemo2();
        staticDemo2.staticMethod();
        staticDemo2.nonStaticMethod();*/
        // 7, 8, 14,18
        // 7, 8, 14,15,18, 19
    }
}
