package com.corejava;

public class EmailNotFoundException extends Exception{
    private String message;

    public EmailNotFoundException(){
        super();
    }
    public EmailNotFoundException(String message){
        super(message);
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
