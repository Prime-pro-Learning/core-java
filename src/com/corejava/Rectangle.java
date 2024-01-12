package com.corejava;

public class Rectangle extends Figure{

    public Rectangle(double dim1, double dim2){
        super(dim1,dim2);
    }
    @Override
    double area() {
        System.out.println("Inside Area of Rectangle");
        return dim1* dim2;
    }

}
