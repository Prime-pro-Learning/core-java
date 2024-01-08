package com.corejava;

public class Stack {
    private int stck[];
    private int tos;// index
    public Stack(int size){
        stck=new int[size];
        tos=-1;
    }
    void push(int item){
        if(tos<stck.length) {
            stck[++tos] = item;
        }else System.out.println("Stack is full");

    }
    int get(){
        return stck[tos--];
        // return
    }

    public int[] getStck() {
        return stck;
    }
}
