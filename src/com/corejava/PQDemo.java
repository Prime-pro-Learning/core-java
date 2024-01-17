package com.corejava;

public class PQDemo {
    public static void main(String[] args) {
        PQ pq=new PQ();//
        new Producer(pq);
        new Consumer(pq);
        System.out.println(Thread.currentThread().getName());
        //PUT GET PUT GET PUT GET
    }
}
