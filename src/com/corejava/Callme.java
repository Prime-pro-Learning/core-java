package com.corejava;

public class Callme {
    synchronized void call(String msg){
        System.out.print("[ "+ msg);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("]");
    }

}
