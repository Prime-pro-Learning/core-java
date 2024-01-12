package com.corejava;

import java.util.Random;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        int a=0, b=0,c=0;
        int arr[]=new int[5];
        Random random=new Random();
        for(int i=0;i<3200;i++) {
            try {
                b= random.nextInt();
                c= random.nextInt();
                a=12345/(b/c);
                arr[10]=45;
            }catch (ArithmeticException e){
                System.out.println("Division by zero.");
                a=0;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Index out of bounds for length ");
                a=0;
            }catch (Exception e){
                System.out.println("super exception");
            }
            System.out.println("a value:"+ a);
            System.out.println("i value:  "+i);
        }
    }
}
