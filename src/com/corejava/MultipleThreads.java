package com.corejava;

public class MultipleThreads implements Runnable{
    String name;

    Thread t;
    MultipleThreads(String name, int priority){
        t=new Thread(this,name);
        t.setPriority(priority);
        System.out.println("Child Thread: "+ t);
        t.start();
    }
    @Override
    public synchronized void run() {
        try{
            for(int n=5; n>0;n--){
                System.out.println(Thread.currentThread().getName()+ " N value: "+n);
                Thread.sleep(3000);  // 3 s
            }//System.out.println("Current Thread: "+thread);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Exiting the child thread");
    }
}
