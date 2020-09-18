package com.azhar.StaticKeyword.StaticVariable;

public class Main {
    public static void main(String[] args) {
        Employe employe = new Employe("Farhan", "CIO", 183848498);

        employe.displayInformation();

        Employe employe1 = new Employe("Tufan", "CTO", 1239724666);
        employe1.displayInformation();


        System.out.println("\n\n\n"+Employe.copyright);

        EmployeCount ec1 = new EmployeCount();
        EmployeCount ec2 = new EmployeCount();
        EmployeCount ec3 = new EmployeCount();
        ec3.total();


    }
}
