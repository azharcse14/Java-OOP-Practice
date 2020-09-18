package com.azhar.Method.DefaultMethod;

public class Main {
    public static void main(String[] args) {

        Employe employe1 = new Employe();
        employe1.setInformation("Azharul Islam", "Android Developer", 1824752549);

        // Print using method
        employe1.displayInformation();

        Employe employe2 = new Employe();
        employe2.setInformation("Mehedi Hasan", "ios Developer", 1824752549);

        employe2.displayInformation();

    }
}
