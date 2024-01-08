package com.corejava;

public class ReturningValue {
     int a;
     public ReturningValue(int a){
         this.a=a;
     }
     ReturningValue incrByTen(){
         ReturningValue value=new ReturningValue(a+10);
         return value;
     }
}
