package com.kodilla.testing.shape;
import java.util.*;

public class ShapeCollector {

    List<Shape> shapeCollection = new ArrayList<>();

    public void addFigure(Shape shape){
        //empty
    }

    public boolean removeFigure(Shape shape) {
        //remember   if(shapeCollection.size() > 0)
        return false;
    }

    public Shape getFigure(int n) {
        return new Circle(55.5);
    }

    public String showFigures() {
        return "AAA";
    }

}
