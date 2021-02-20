package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double field;

    public Circle(double field) {
        this.field = field;
    }

    public String getShapeName() {
        return "Circle";
    }
    public double getField() {
        return field;
    }
    @Override
    public String toString(){return "";}
}
