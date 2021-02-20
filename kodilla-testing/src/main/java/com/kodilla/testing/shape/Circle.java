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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.field, field) == 0;
    }
    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(field);
        return (int) (temp ^ (temp >>> 32));
    }
}
