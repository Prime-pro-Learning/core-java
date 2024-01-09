package com.corejava;

public class FinalVariable {
    int a=10;
    static int b=25;
    final int c;

    public FinalVariable(final int c) {
        this.c=c;
       // c=78;
    }

    void sum(final double dol){
        int i1 = c+12;
        int i = a + b + c;
        System.out.println(i);
        //c=12;
    }
}
