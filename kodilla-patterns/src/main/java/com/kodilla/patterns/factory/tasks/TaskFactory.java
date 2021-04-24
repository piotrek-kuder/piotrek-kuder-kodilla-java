package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public Task makeTask(String taskClass) {

        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("shopping", "apple", 4);
            case PAINTING:
                return new PaintingTask("painting", "green", "room");
            case DRIVING:
                return new DrivingTask("driving", "job", "bus");
            default:
                return null;
        }
    }
}
