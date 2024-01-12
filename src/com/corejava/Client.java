package com.corejava;

public class Client implements Callback{
    // SubClass extends Super
    @Override
    public void callback(int value) {
        System.out.println("Client callback() method: "+ value);
    }
    void nonInterfaceM(){
        System.out.println("special method");
    }
   /*public  void submit(){
        System.out.println("Client submit method");
    }*/
   /*static  void process(){
       System.out.println("static method in Client class");
   }*/
}
