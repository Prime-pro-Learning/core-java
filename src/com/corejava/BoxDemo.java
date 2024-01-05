package com.corejava;

public class BoxDemo {
    public double volume(){
        return 0.0;
    }
    public static void main(String[] args) {
        Box box1=new Box(96.75,63.14,45.12); //calling
        Box box2=new Box(96.75,63.14,45.12); //calling
        boolean equals = box1.equals(box2);
        System.out.println(equals);
        /*System.out.println(box.volume());
        //System.out.println(box.getWidth()); //96.75
        box.setValues(45.63,78.14,52.78);

        *//*box.depth=45.12;
        box.height=63.14;
         box.width=96.75;*//*
        ///this.volume();
       // System.out.println(box.getWidth()); //45.63
*/    }

}
