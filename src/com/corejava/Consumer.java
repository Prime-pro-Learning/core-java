package com.corejava;

public class Consumer implements Runnable{
    PQ pq;
    Consumer(PQ pq){
        this.pq=pq;
        new Thread(this,"Consumer").start();
    }
    @Override
    public void run() {
        while(true){
            pq.get(); // loading the value
        }
    }
}
