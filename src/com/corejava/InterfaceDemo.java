package com.corejava;

public class InterfaceDemo {
    public static void main(String[] args) {
        Client call=new Client();
        call.callback(456);
        call.nonInterfaceM();
        call.submit();
        call.color();
        Callback.process();
    }
}
