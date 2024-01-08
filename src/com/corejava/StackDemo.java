package com.corejava;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack=new Stack(50);
        for(int i=1;i<=stack.getStck().length;i++)
            stack.push(10*i);
        /*stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);*/
        for(int i=1;i<=stack.getStck().length;i++)
         System.out.println(stack.get());
    }
}
