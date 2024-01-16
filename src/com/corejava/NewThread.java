package com.corejava;

public class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t=new Thread(this,"Demo Thread");
        t.start();
    }

    @Override
    public void run() {
        try{
            for(int n=5; n>0;n--){
                System.out.println(Thread.currentThread()+ "N value: "+n);
                Thread.sleep(3000);  // 3 s
            }//System.out.println("Current Thread: "+thread);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Exiting the child thread");
    }
}
