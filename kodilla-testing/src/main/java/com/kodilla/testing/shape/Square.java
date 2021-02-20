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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.field, field) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(field);
        return (int) (temp ^ (temp >>> 32));
    }
}
