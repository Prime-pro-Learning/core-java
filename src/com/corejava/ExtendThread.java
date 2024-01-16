package com.corejava;

public class ExtendThread extends Thread{
    ExtendThread(){
        super("Demo Thread");// super(45,'A') super.test();
       start();
    }
    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName());
            System.out.println("Enter into Extend Thread run method");
            for(int n=5; n>0;n--){
                System.out.println(Thread.currentThread()+ "N value: "+n);
                Thread.sleep(3000);  // 3 s
            }//System.out.println("Current Thread: "+thread);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Exiting the child thread");
    }
    public void submit(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("submit method");
    }

}
