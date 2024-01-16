package com.corejava;

public class ExceptionDemo {
    static void process() throws ClassNotFoundException {
        Class.forName("com.corejava.ExceptionDemo20");
       /* System.out.println("process method");
        throw new ClassNotFoundException("com.corejava.ExceptionDemo20");*/
    }

    public static void main(String[] args)  throws ClassNotFoundException {
        //process();
        try {
            process();
            //submit();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("finally block");
        }
        System.out.println("After try/catch statements");
        /*try {
            *//*int a = 45;
            int d = 45 / 0; //*//*
            throw new NullPointerException("Line number 9");
            //Class.forName("com.corejava.ExceptionDemo2");
        }catch (Exception ex){
            System.out.println(ex);
        }
        finally {
            System.out.println("finally block");
        }
        System.out.println("After try/catch statements");
        //System.out.println(d);*/
    }
}
