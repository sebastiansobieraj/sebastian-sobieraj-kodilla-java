package com.kodilla.testing.com.kodilla.testing.shape;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements Shape {

    private String name;
    private double field;
    private double r = 5;

    public Circle(String name, double field) {
        this.name = name;
        this.field = field;
    }

    @Override
    public String getShapeName(String name) {
        return name;
    }

    @Override
    public double getField() {
        field = PI * pow(r, 2);
        return PI * pow(r, 2);
    }
}

