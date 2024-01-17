package com.corejava;

public class StringDemo {
    public static void main(String[] args) {
       /* char ch[]={'j','a','v','a'};
        char ch1='j'; //java
        byte ascii[]={65,66,67,68,69,70};
        String str=new String("Hello");
       String charr=new String(ch);
       String by=new String(ascii);
       String s2="abc";// literals
        System.out.println(str);
        System.out.println(charr.length());
        System.out.println(by.length());
        System.out.println(s2.length());
        String age="9";
        String s="He is "+age+" Years old";
        System.out.println(s);*/
        /*String s="four: "+(2+2);
        char ch[]=new char[10];
        int a=2+2;
        System.out.println(s.charAt(2));// four: 4
        s.getChars(0,3,ch,0);
        for(byte bytes:s.getBytes()) System.out.println(bytes);
        //System.out.println(bytes[0]);
        System.out.println(ch);*/
        /*String s1="Hello";
        String s2="Hello";
        String s3="Good-bye";
        String s4="HELLO";
        System.out.println("s1-->s2 "+ s1.equals(s2)); //true
        System.out.println("s1-->s3"+ s1.equals(s3));// false
        System.out.println("s1--->s4"+ s1.equals(s4));// false
        System.out.println("s1-->s4"+ s1.equalsIgnoreCase(s4)); //
        System.out.println(s1.startsWith("123"));
        System.out.println(s1.endsWith("123"));*/
       /* String arr[]={"Now","is","the","time","for","all"};
        for(int i=0; i< arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i].compareTo(arr[j])==0)
                    System.out.println(arr[j]);
            }
        }*/
        String s1="Hello";
        System.out.println(s1.indexOf('l'));
        System.out.println(s1.lastIndexOf('l'));
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(1,3));
        String age="9";
        String s="  He is ".concat(age).concat(" Years old  ");
        System.out.println(s);
        String replace = s.replace('H', 'O');
        System.out.println(replace);
        System.out.println(replace.toUpperCase());
        StringBuffer buffer=new StringBuffer();
        //StringBuilder
    }
}
