package com.corejava;

public class CallByReference {
    int a,b;
    public CallByReference(int i, int j){
        a=i;
        b=j;
    }
    void meth(CallByReference call){// local variable
        call.a*=2;
        call.b/=2;
    }
}
