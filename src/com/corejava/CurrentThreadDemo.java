package com.corejava;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        NewThread thread1 = new NewThread();
        ExtendThread thread=new ExtendThread();
        thread.setName("ABC");
        //thread1.setName("ABC");
        thread.submit();
        thread.run();
        //System.out.println("Current Thread: "+thread);
        /*thread.setName("My Thread");
        System.out.println("After change the name: "+thread);*/
        /*try{
            for(int n=5; n>0;n--){
                System.out.println(Thread.currentThread()+ "N value: "+n);
                Thread.sleep(3000);  // 3 s
            }//System.out.println("Current Thread: "+thread);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread completed...");*/
    }
}
