package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Testing calculateAdvStatistics(Statistics statistics)")
public class StatisticsCollectorTestSuite {

    private static int testCounter = 1;
    private static List<String> userNames = new ArrayList<>();

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Start of tests");
    }
    @BeforeEach
    public void beforeEach() {
        
    }

}
