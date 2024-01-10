package com.corejava;

public class Varargs {
    static void test(int ...v){// varargs
        System.out.println("Number of args: "+ v.length);

        for(int x:v) System.out.print(x+" ");
        System.out.println();
    }
    static void test(boolean ...v){// varargs
        System.out.println("Number of args: "+ v.length);
        for(boolean x:v) System.out.print(x+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        //
        int n1[]={10,20};
        int n2[]={10,20,30};
        int n3[]={};
        test(10,20);
        test(10,20,30);
        test(true,false,true);
        test(true,false);
        //test();
        for( ; ;) System.out.println();

        //test2();
        /*
        Number of args: 2
            10 20
        Number of args: 3
        10 20 30
        Number of args: 0
         */
        //sum();
    }

}
