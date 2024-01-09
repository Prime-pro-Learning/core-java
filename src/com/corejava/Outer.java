package com.corejava;

public class Outer {
    int outer_x=100;
    static int outer_y=200;
     class Inner{ // non-static nested class
        void display(){
            System.out.println("outer_x value: "+ outer_x);
            System.out.println(outer_y);
        }
        void test(){

        }

    }
    /*void test(){
        Inner inner=new Inner();
        inner.display();
    }*/

    public static void main(String[] args) {
        Outer outer=new Outer();
        Inner inner = outer. new Inner();
        inner.display();
    }
}
