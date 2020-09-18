package com.azhar.AutomaticTypeConvertion;

public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition();

        addition.add(22, 34);
        addition.add(22, 11, 22);
        addition.add(22.0, 99.99);
        addition.add();
        addition.add();

    }
}


