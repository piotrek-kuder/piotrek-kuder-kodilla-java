package com.kodilla.testing.shape;
import java.util.*;

public class ShapeCollector {

    List<Shape> shapeCollection = new ArrayList<>();

    public void addFigure(Shape shape){
        shapeCollection.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(shapeCollection.contains(shape)) {
            shapeCollection.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        if(n >= 0 && n < shapeCollection.size()) {
            return shapeCollection.get(n);
        }
        return null;
    }

    public String showFigures() {
        String figuresNames = "";

        for(Shape figure: shapeCollection) {
            figuresNames = figuresNames + figure.getShapeName() + " ";
        }
        return figuresNames.substring(0,figuresNames.length() - 1);
    }

}
