package com.corejava;

public class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;
    public Caller(Callme callme, String s){
        target=callme;
        msg=s;
        t=new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }
}
