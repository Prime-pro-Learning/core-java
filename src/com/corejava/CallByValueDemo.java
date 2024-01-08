package com.corejava;

public class CallByValueDemo {
    public static void main(String[] args) {
        /*int a=15, b=20;
        *//*CallByValue callByValue=new CallByValue();
        System.out.println("before a and b values: "+ a+ " "+b); //15,20
        callByValue.meth(a,b);
        System.out.println("after a and b values: "+ a+ " "+b); //
        System.out.println(callByValue.i);*//*
        CallByReference call=new CallByReference(a,b);
        System.out.println("before a and b values: "+ call.a+ " "+call.b); //15,20
        call.meth(call);
        System.out.println("after a and b values: "+ call.a+ " "+call.b); //*/
        ReturningValue value1=new ReturningValue(10);
        ReturningValue value = value1.incrByTen(); //20
        ReturningValue value2 = value1.incrByTen(); //20
        ReturningValue value3 = value1.incrByTen(); //20
        System.out.println("Return value: "+ value.a);
    }
}
