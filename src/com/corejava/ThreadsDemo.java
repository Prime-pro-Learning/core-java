package com.corejava;

public class ThreadsDemo {
    public static void main(String[] args) {
        MultipleThreads threads1=new MultipleThreads("Thread-1",10);
        MultipleThreads threads2=new MultipleThreads("Thread-2",9);
        MultipleThreads threads3=new MultipleThreads("Thread-3",2);
        MultipleThreads threads4=new MultipleThreads("Thread-4",6);
        System.out.println("Thread Priority:  "+threads1.t.getPriority());
        System.out.println("Thread is Alive: "+ threads1.t.isAlive());
        System.out.println("Thread is Alive: "+ threads2.t.isAlive());
        System.out.println("Thread is Alive: "+ threads3.t.isAlive());
        System.out.println("Thread is Alive: "+ threads4.t.isAlive());
        try {
            threads1.t.join();//
            threads2.t.join();
            threads3.t.join();
            threads4.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread is Alive: "+ threads1.t.isAlive());
        System.out.println("Thread is Alive: "+ threads2.t.isAlive());
        System.out.println("Thread is Alive: "+ threads3.t.isAlive());
        System.out.println("Thread is Alive: "+ threads4.t.isAlive());

        System.out.println("Main thread completed...");
    }
}
