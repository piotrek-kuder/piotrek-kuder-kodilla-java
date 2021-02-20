package com.kodilla.testing.shape;

public class Square implements Shape {

    private double field;

    public Square(double field) {
        this.field = field;
    }

    public String getShapeName() {
        return "Square";
    }
    public double getField() {
        return field;
    }
}
