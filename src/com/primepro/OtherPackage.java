package com.primepro;

import com.corejava.Protection;

public class OtherPackage {
    public OtherPackage(){
        Protection protection = new Protection();
        System.out.println("n value:"+protection.n);
        System.out.println("n_pri value:"+protection.n_pri);
        System.out.println("n_pro value:"+protection.n_pro);
        System.out.println("n_pub value:"+protection.n_pub);
    }
}
