package com.corejava;

public class Producer implements Runnable{
    PQ pq;
    Producer(PQ pq){
        this.pq=pq;
        new Thread(this,"Producer").start();
    }
    @Override
    public void run() {
        int i=0;
        while(true){
            pq.put(i++); //insert
        }
    }
}
