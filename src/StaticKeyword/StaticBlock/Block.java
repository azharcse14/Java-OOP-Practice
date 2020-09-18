package com.azhar.StaticKeyword.StaticBlock;

public class Block {
    static String b;
    static String a;

    static {
        a = "Apple";
        b = "Blackberry";
    }

    static void method(){
        System.out.println(b);
    }
}
