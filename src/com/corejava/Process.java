package com.corejava;

public class Process {
    int value;
    String str;
    char ch;

    public Process(int value, String str, char ch){

    }
    public Process(char ch, String str, int value){

    }
    public Process(String str, char ch, int value){

    }
   /* void sum(){

    }*/
   public static void main(String[] args) {
       Process process=new Process('A',"STR",45);
   }

}
