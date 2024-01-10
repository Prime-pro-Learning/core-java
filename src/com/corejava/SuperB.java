package com.corejava;

public class SuperB extends SuperA{
    char value='B';
    void printChar(){
        System.out.println(value);
    }
    void setChar(char value){
        this.value=value;
    }
}
