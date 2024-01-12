package com.corejava;

public class UserNameNotFoundException extends RuntimeException{
    private String message;

    public UserNameNotFoundException(){
        super();
    }
    public UserNameNotFoundException(String message){
        super(message);
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
