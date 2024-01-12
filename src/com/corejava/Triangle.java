package com.corejava;

public class Triangle extends Figure{
    public Triangle(double dim1, double dim2){
        super(dim1,dim2);
    }

    @Override
    double area() {
        System.out.println("Inside Area of Triangle");
        return dim1 * dim2/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "dim1=" + dim1 +
                ", dim2=" + dim2 +
                '}';
    }
}
