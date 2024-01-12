package com.corejava;

public interface Callback {
    int value=45;
     void callback(int value); // abstract method


    /*void submit(){
        // method body
    }*/
     default void submit(){
         System.out.println("Callback submit() ");
         //value=78;
    }
     default void color(){
        System.out.println("red");
    }
    static  void process(){
        System.out.println("static method in Callback interface");
    }


}
