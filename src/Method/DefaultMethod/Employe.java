package com.azhar.Method.DefaultMethod;

public class Employe {
    String Name;
    String Designation;
    int Phone;

    void setInformation(String n, String d, int p){
        Name = n;
        Designation = d;
        Phone = p;

    }
    void displayInformation(){
        System.out.println(Name);
        System.out.println(Designation);
        System.out.println(Phone);
        System.out.println("\n");
    }
}

