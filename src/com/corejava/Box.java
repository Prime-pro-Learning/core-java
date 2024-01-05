package com.corejava;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double width,double height, double depth) { //called
        this(12.12,45.63);
        this.width = width;
        this.height = height;
        this.depth = depth;

    }
    public Box(int width,double height, double depth) { //called
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


    public Box(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Box(double width) {
        this.width = width;
    }

    public Box(){}

    public void setValues(double width, double height, double depth){
        this.volume();
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    /*public void setValues(int width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }*/
    public double getWidth(){
        return width;
    }
    public double volume(){
        return width* height* depth;
    }
    public boolean equals(Box box){
        if(width==box.width && height==box.height && depth==box.depth) return true;
        else return false;
    }

}
