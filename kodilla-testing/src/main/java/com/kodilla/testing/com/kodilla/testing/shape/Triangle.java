package com.kodilla.testing.com.kodilla.testing.shape;


public class Triangle implements Shape {

    private String name = "";
    private double field = 0.0;

    public Triangle(String name, double field) {
        this.name = name;
        this.field = field;
    }

    public String getShapeName() {
        return name;
    }

    public double getField(double a, double h) {
        field = 0.5 * a * h;
        return 0.5 * a * h;
    }
}
