package com.corejava;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(double width, double height, double depth, double weight){
        super(width, height, depth);
        this.weight=weight;
    }
    public BoxWeight(double width, double height, double weight){
        super(width, height);
        this.weight=weight;
    }

    double volume1(){
        System.out.println("BoxWeight volume1() method");
        return super.volume1();

    }
    void sum(){
        System.out.println("****");
    }
}
