package com.corejava;

public class UseStatic {
    static int a;
    static int b;
     static void meth(int x){
         System.out.println("x value: "+x);
         System.out.println("a value: "+a);
         System.out.println("b value: "+b);
         //sum();
     }
     static{
         //System.out.println("x value: "+x);
         System.out.println("static block a value: "+a);
         System.out.println("static block  b value: "+b);
         meth(25);
         //sum();
     }
    /*{
        //instance block
    }*/
     void sum(){
         //System.out.println("x value: "+x);
         System.out.println("a value: "+a);
         System.out.println("b value: "+b);
         meth(45);
     }

    public static void main(String[] args) {
        /*UseStatic aStatic=new UseStatic();
        System.out.println(UseStatic.a);
        System.out.println(aStatic.b);*/
        //UseStatic.meth(10);
        //callme();
        StaticDemo.callme();
    }
}
