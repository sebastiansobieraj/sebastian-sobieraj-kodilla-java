package com.kodilla.testing.com.kodilla.testing.shape;


public class Square implements Shape {

    private String name = "";
    private double field = 0.0;

    public Square(String name, double field) {
        this.name = name;
        this.field = field;
    }

    public String getShapeName() {
        return name;
    }

    public double getField(double a, double b) {
        field = a * b;
        return a * b;
    }
}
