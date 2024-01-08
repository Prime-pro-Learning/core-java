package com.corejava;

public class CallByValue {
    int i=10, j=20; // instance
    void meth(int i,int j){// local variable
        System.out.println("before a and b values: "+ i+ " "+j); //15,20
        i*=2;// i=i*2
        j/=2;
        System.out.println("after a and b values: "+ i+ " "+j); //15,20
        this.i=i;
        this.j=j;
    }
    void sum(){
        System.out.println("before a and b values: "+ i+ " "+j); //15,20
    }

}
