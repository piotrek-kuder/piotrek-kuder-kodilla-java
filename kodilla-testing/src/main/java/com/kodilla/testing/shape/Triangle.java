package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double field;

    public Triangle(double field) {
        this.field = field;
    }

    public String getShapeName() {
        return "Triangle";
    }
    public double getField() {
        return field;
    }
}
