package com.corejava;

public class Outer2 {
    static int outer_x=200;
    static int outer_y=250;
    private static int outer_z=10;
    static class Inner{
        void display(){
            System.out.println("outer_x: "+outer_x);
            System.out.println("outer_x: "+outer_y);
            System.out.println("outer_z: "+outer_z);
        }
    }

    public static void main(String[] args) {
        /*
        Outer outer=new Outer();
        Inner inner = outer. new Inner();
        inner.display(); // non static
         */
        Inner outer=new Outer2.Inner();
         // static
        outer.display();
    }
}
