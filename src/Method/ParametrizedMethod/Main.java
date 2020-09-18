package com.azhar.Method.ParametrizedMethod;

public class Main {
    public static void main(String[] args) {

        Employe employe1 = new Employe();
        employe1.Name = "Azharul Islam";
        employe1.Designation = "Android Developer";
        employe1.Phone = 1824752549;

        // Print using method
        employe1.displayInformation();

        Employe employe2 = new Employe();
        employe2.Name = "Mehedi Hasan";
        employe2.Designation = "ios Developer";
        employe2.Phone = 1824752549;


        employe2.displayInformation();

    }
}
