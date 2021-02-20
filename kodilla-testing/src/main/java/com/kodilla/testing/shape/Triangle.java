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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        return Double.compare(triangle.field, field) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(field);
        return (int) (temp ^ (temp >>> 32));
    }
}
