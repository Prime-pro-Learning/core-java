package com.corejava;

public class SubB extends SuperB{
    int k;
    public SubB(int a, int b, int c, int d){
        super(a,b,c);
        k=d;
    }
    void showK(){
        System.out.println("K value: "+ k);
       // showIJ();
    }
    void sum(){
        System.out.println(i+j+k);
    }

}
