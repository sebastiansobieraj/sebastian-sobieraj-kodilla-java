package com.kodilla.testing.com.kodilla.testing.shape;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements Shape {

    private String name = "";
    private double field = 0.0;

    public Circle(String name, double field) {
        this.name = name;
        this.field = field;
    }

    public String getShapeName() {
        return name;
    }

    public double getField(double r) {
        field = PI * pow(r, 2);
        return PI * pow(r, 2);
    }
}

