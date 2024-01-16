package com.corejava;

public class Thread2Demo {
    public static void main(String[] args) {
        Callme callme=new Callme();
        Caller caller1=new Caller(callme,"Hello");
        Caller caller2=new Caller(callme,"Synchronized");
        Caller caller3=new Caller(callme,"World");
        try {
            caller1.t.join();
            caller2.t.join();
            caller3.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } //[Hello] [Synchronized] [World]
    }
}
