package com.corejava;

public class SuperB extends SuperA{
    char value='B';
    int k;
    public SuperB(int a, int b, int c){
        super(a,b);
        k=c;
    }
    void printChar(){
        System.out.println(value);
    }
    void setChar(char value){
        this.value=value;
    }

    @Override
    void show() {

    }
    /*void show(){
        //super.show();
        System.out.println("SuperB show() method: "+ k);
    }*/
}
