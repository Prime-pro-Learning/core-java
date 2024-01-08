package com.corejava;

public class Factorial {
    int fact(int n){ //
        int result;
        if(n==1) return 1;
        result=fact(n-1)*n; //
        return result;
    }

    public static void main(String[] args) {
        Factorial factorial=new Factorial();
        int fact = factorial.fact(5);//
        System.out.println(fact);
    }

}
