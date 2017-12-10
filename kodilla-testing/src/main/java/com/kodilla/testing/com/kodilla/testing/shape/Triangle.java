package com.kodilla.testing.com.kodilla.testing.shape;


public class Triangle implements Shape {

    private String name;
    private double field;
    private double a = 5;
    private double h = 5;

    public Triangle(String name, double field) {
        this.name = name;
        this.field = field;
    }

    @Override
    public String getShapeName(String name) {
        return name;
    }

    @Override
    public double getField() {
        field = 0.5 * a * h;
        return 0.5 * a * h;
    }
}
