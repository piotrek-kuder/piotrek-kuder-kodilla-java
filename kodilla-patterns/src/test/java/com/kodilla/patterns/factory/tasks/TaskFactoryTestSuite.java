package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testShoppingExecuted() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        String result = shopping.toString();
        boolean status = shopping.isTaskExecuted();
        //Then
        System.out.println(shopping);
        assertTrue(status);
        assertEquals("shopping" ,shopping.getTaskName());
        assertEquals("shopping : apple : 4.0" , result);
    }

    @Test
    void testShoppingNotExecuted() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        boolean status = shopping.isTaskExecuted();
        //Then
        assertFalse(status);
    }

    @Test
    void testPaintingExecuted() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        String result = painting.toString();
        boolean status = painting.isTaskExecuted();
        //Then
        System.out.println(painting);
        assertTrue(status);
        assertEquals("painting" ,painting.getTaskName());
        assertEquals("painting : green : room" , result);
    }

    @Test
    void testPaintingNotExecuted() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        boolean status = painting.isTaskExecuted();
        //Then
        assertFalse(status);
    }

    @Test
    void testDrivingExecuted() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        String result = driving.toString();
        boolean status = driving.isTaskExecuted();
        //Then
        System.out.println(driving);
        assertTrue(status);
        assertEquals("driving" , driving.getTaskName());
        assertEquals("driving : job : bus" , result);
    }

    @Test
    void testDrivingNotExecuted() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        boolean status = driving.isTaskExecuted();
        //Then
        assertFalse(status);
    }
}
