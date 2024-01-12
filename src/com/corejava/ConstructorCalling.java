package com.corejava;

public class ConstructorCalling {
    public static void main(String[] args) {
        /*ConC conC=new ConC();
        conC.callme();// */
        ConA a=new ConA();// a.callme();
        ConB b=new ConB();
        ConC conC=new ConC();
        ConA ref;//
        ref=a;
        ref.callme(); // ConA calling
        ref=b;
        ref.callme(); //
        ref=conC;
        ref.callme();//



    }
}
