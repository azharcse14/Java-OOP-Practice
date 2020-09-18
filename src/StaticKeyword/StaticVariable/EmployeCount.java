package com.azhar.StaticKeyword.StaticVariable;

public class EmployeCount {
    static int count = 0;

    EmployeCount(){
        count++;
    }

    void total(){
        System.out.println(count);
    }
}
