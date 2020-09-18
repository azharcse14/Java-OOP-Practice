package com.azhar.StaticKeyword.StaticMethod;

public class Employe {

    static int r = 44444;
    String w = "World";

    //normal class
    void information(){
        System.out.println(w);
        System.out.println("Hello Bangladesh!");
    }

    static void inform(){
        System.out.println(r);
        System.out.println("Hello Static Bangladesh!");
    }
}
