package com.azhar.Problem;

public class Box {
    double height, weight, depth;

    Box(double h, double w, double d){
        height = h;
        weight = w;
        depth = d;
    }

    void displayVol(){
        double vol = height * weight * depth;
        System.out.println(vol);
    }
}
