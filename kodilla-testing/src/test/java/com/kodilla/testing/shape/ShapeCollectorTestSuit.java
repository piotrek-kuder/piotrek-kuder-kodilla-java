package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Shape collector's methods testing")
public class ShapeCollectorTestSuit {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Starting tests");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("All tests finished");
    }
    @BeforeEach
    public void beforeEach() {
        testCounter++;
        System.out.println("Running test nr " + testCounter);
    }

    @Nested
    @DisplayName("Testing adding and removing")
    class TestAdd_Remove {
        @Test
        void testingAddFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            //When
            collector.addFigure(new Circle(43.7));
            //Then
            assertEquals(1, collector.shapeCollection.size());
        }
        @Test
        void testingRemoveFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Circle(55.5));
            //When
            boolean result = collector.removeFigure(new Circle(55.5));
            //Then
            assertTrue(result);
            assertEquals(0, collector.shapeCollection.size());

        }
    }

    @Nested
    @DisplayName("Testing displaying info")
    class TestGet_Show {
        @Test //index in range
        void testGetFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Circle(55.5));
            //When
            Shape result = collector.getFigure(0);
            //Then
            assertEquals(new Circle(55.5), result);

        }
        @Test   //index below range
        void testGetFigureBelowRange() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Circle(55.5));
            //When
            Shape result = collector.getFigure(-3);
            //Then
            assertNull(result);
        }
        @Test   //index above range
        void testGetFigureAboveRange() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Circle(55.5));
            //When
            Shape result = collector.getFigure(5);
            //Then
            assertNull(result);
        }
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Circle(55.5));
            //When
            String result = collector.showFigures();
            //Then
            assertEquals("Circle", result);
        }
        @Test
        void testShowManyFigures() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Circle(55.5));
            collector.addFigure(new Triangle(10));
            collector.addFigure(new Square(12.3));
            //When
            String result = collector.showFigures();
            //Then
            assertEquals("Circle Triangle Square", result);
        }
    }

}
