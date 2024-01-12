package com.corejava;

public abstract class SuperA {
    private boolean flag=false;
    int i,j; //instance variables
    public SuperA(int a, int b){
        i=a;
        j=b;
    }
    abstract void show();
    /*void show(){
        System.out.println("i and j "+i + " "+j);
    }*/
}
