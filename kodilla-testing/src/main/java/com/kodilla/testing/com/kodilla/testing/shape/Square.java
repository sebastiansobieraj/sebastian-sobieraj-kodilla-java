package com.kodilla.testing.com.kodilla.testing.shape;


public class Square implements Shape {

    private String name;
    private double field;
    private double a = 5;
    private double b = 5;

    public Square(String name, double field) {
        this.name = name;
        this.field = field;
    }

    @Override
    public String getShapeName(String name) {
        return name;
    }

    @Override
    public double getField() {
        field = a * b;
        return a * b;
    }
}