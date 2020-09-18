package com.azhar.ClassAndObject;

public class Main {
    public static void main(String[] args) {

        Employe employe1 = new Employe();
        employe1.Name = "Azharul Islam";
        employe1.Designation = "Android Developer";
        employe1.Phone = 1824752549;

        System.out.println(employe1.Name);
        System.out.println(employe1.Designation);
        System.out.println(employe1.Phone);
        System.out.println("\n");

        Employe employe2 = new Employe();
        employe2.Name = "Mehedi Hasan";
        employe2.Designation = "ios Developer";
        employe2.Phone = 1824752549;
        

        System.out.println(employe2.Name);
        System.out.println(employe2.Designation);
        System.out.println(employe2.Phone);

    }
}
