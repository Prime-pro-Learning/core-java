package com.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.function.Predicate;

public class ExceptionDemo4 {
    static void submit(String username, String password, String email) throws EmailNotFoundException {
        if(username==null) throw new UserNameNotFoundException("Username is required");
        if(email==null) throw new EmailNotFoundException("Email is required");
        // submit operation
        System.out.println("username: "+username);
        System.out.println("Password: "+password);
        System.out.println("Email : "+email);

    }
    public static void main(String[] args) {
        try {
            //submit(null,"password@123","email@email.com");
            //submit("ramesh","password@123",null);
            submit("ramesh","password@123","email@email.com");
        } catch (EmailNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (UserNameNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
