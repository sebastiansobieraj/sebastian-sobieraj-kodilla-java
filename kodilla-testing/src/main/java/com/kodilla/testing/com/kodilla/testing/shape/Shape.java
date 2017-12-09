package com.kodilla.testing.com.kodilla.testing.shape;

public interface Shape {
    String name = "";
    double field = 0.0;

    static String getShapeName(){
        return name;
    }

    static double getField(){
        return field;
    }
}
