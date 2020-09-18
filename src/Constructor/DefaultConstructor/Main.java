package com.azhar.Constructor.DefaultConstructor;

public class Main {
    public static void main(String[] args) {

        Employe employe1 = new Employe("Azharul Islam", "Android Developer", 1824752549);
        // Print using method
        employe1.displayInformation();


        Employe employe2 = new Employe("Mehedi Hasan", "ios Developer", 1824752549);
        employe2.displayInformation();

        Employe employe3 = new Employe();
        employe3.displayInformation();

    }
}
