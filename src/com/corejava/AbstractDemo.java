package com.corejava;

import java.util.List;

public class AbstractDemo {
    public static void main(String[] args)throws CloneNotSupportedException {
        /*AbstractClassA classA=new ClassB();
        classA.callme();
        classA.callmetoo();*/
        //Figure f=new Figure(12.31,45.10);
        //Rectangle r=new Rectangle(45.32,96.12);
        Triangle t=new Triangle(78.12,85.25);
        System.out.println(t.getClass().getName());
        System.out.println("@");
        System.out.println(Integer.toHexString(t.hashCode()));
        System.out.println("---------");
        System.out.println(t);

        /*System.out.println(r.area());
        System.out.println(t.area());
        Figure f;//de
        f=r;
        System.out.println(f.area());
        f=t;
        System.out.println(f.area());*/

    }
}
