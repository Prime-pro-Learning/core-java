package com.corejava;

public abstract class Figure{
    double dim1=45.23;
    double dim2=96.74;
    public Figure(double dim1, double dim2){
        System.out.println("Figure class constructor calling");
        this.dim1=dim1;
        this.dim2=dim2;
    }
    abstract double area();
    /*int square(int i){ /// 100 10,20,30,40,50,60
        return i*i;
    } //10
    void submit(String name, String password, String email,double zipcode, long num){
        System.out.println();
    }*/
}
