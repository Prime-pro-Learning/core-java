package com.corejava;

public class PQ {
    int n;
    boolean valueSet=false;
    synchronized int get(){
        while(!valueSet)
            try{
                wait();
            } catch (InterruptedException e) {
                System.out.println("wait method is Interrupted");
            }
        System.out.println("GET: "+n);
        valueSet=false;
        notify();
        return n;
    }
    synchronized void put(int n){
        while(valueSet)
            try{
                wait();
            }catch (InterruptedException e) {
                System.out.println("wait method is Interrupted");
            }
        this.n=n;
        System.out.println("PUT: "+ n);
        valueSet=true;
        notify();
    }

}
