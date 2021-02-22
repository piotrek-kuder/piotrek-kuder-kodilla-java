package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("Testing calculateAdvStatistics")
public class StatisticsCollectorTestSuite {

    private static int testCounter = 1;
    private List<String> userNamesListN;

    //-------
    private List<String > createUserNamesListN(int n) {
        for (int i = 0; i < n; i++) {
            userNamesListN.add("Name" + i);
        }
        return userNamesListN;
    }
    //-------

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Start of all tests\n");
    }
    @BeforeEach
    public void beforeEach() {
        System.out.println("Starting test nr " + testCounter);
        testCounter++;
        // cleaning content of list
        userNamesListN = new ArrayList<>();
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("End of all tests");
    }
    @Mock
    Statistics statisticsMock;

    @Test //1
    @DisplayName("Calculate Statistics --- 0p 0k 0u.")
    public void testCalculateStatisticsZeroPZeroKZeroU() {
        //Given
        StatisticsCollector statisticsCollector = new StatisticsCollector();

        when(statisticsMock.usersNames()).thenReturn(createUserNamesListN(0));
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        statisticsCollector.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, statisticsCollector.getUsersCount());
        assertEquals(0, statisticsCollector.getPostsCount());
        assertEquals(0, statisticsCollector.getCommentsCount());
        assertEquals(0, statisticsCollector.getAveragePostsPerUser());
        assertEquals(0, statisticsCollector.getAverageCommentsPerUser());
        assertEquals(0, statisticsCollector.getAverageCommentsPerPost());
    }
    @Test //2
    @DisplayName("Calculate Statistics --- 1000p 0k 0u.")
    public void testCalculateStatistics1000PZeroKZeroU() {
        //Given
        StatisticsCollector statisticsCollector = new StatisticsCollector();

        when(statisticsMock.usersNames()).thenReturn(createUserNamesListN(0));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        statisticsCollector.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, statisticsCollector.getUsersCount());
        assertEquals(1000, statisticsCollector.getPostsCount());
        assertEquals(0, statisticsCollector.getCommentsCount());
        assertEquals(0, statisticsCollector.getAveragePostsPerUser());
        assertEquals(0, statisticsCollector.getAverageCommentsPerUser());
        assertEquals(0, statisticsCollector.getAverageCommentsPerPost());
    }
    @Test //3
    @DisplayName("Calculate Statistics --- 0p 1000k 0u.")
    public void testCalculateStatisticsZeroP1000KZeroU() {
        //Given
        StatisticsCollector statisticsCollector = new StatisticsCollector();

        when(statisticsMock.usersNames()).thenReturn(createUserNamesListN(0));
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        statisticsCollector.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, statisticsCollector.getUsersCount());
        assertEquals(0, statisticsCollector.getPostsCount());
        assertEquals(1000, statisticsCollector.getCommentsCount());
        assertEquals(0, statisticsCollector.getAveragePostsPerUser());
        assertEquals(0, statisticsCollector.getAverageCommentsPerUser());
        assertEquals(0, statisticsCollector.getAverageCommentsPerPost());
    }
    @Test //4
    @DisplayName("Calculate Statistics --- 0p 0k 1000u.")
    public void testCalculateStatisticsZeroPZeroK1000U() {
        //Given
        StatisticsCollector statisticsCollector = new StatisticsCollector();

        when(statisticsMock.usersNames()).thenReturn(createUserNamesListN(1000));
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        statisticsCollector.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, statisticsCollector.getUsersCount());
        assertEquals(0, statisticsCollector.getPostsCount());
        assertEquals(0, statisticsCollector.getCommentsCount());
        assertEquals(0, statisticsCollector.getAveragePostsPerUser());
        assertEquals(0, statisticsCollector.getAverageCommentsPerUser());
        assertEquals(0, statisticsCollector.getAverageCommentsPerPost());
    }
    @Test //5
    @DisplayName("Calculate Statistics --- 1000p 1000k 0u.")
    public void testCalculateStatistics1000P1000KZeroU() {
        //Given
        StatisticsCollector statisticsCollector = new StatisticsCollector();
        when(statisticsMock.usersNames()).thenReturn(createUserNamesListN(0));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        statisticsCollector.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, statisticsCollector.getUsersCount());
        assertEquals(1000, statisticsCollector.getPostsCount());
        assertEquals(1000, statisticsCollector.getCommentsCount());
        assertEquals(0, statisticsCollector.getAveragePostsPerUser());
        assertEquals(0, statisticsCollector.getAverageCommentsPerUser());
        assertEquals(1, statisticsCollector.getAverageCommentsPerPost());
    }
    @Test //6
    @DisplayName("Calculate Statistics --- 0p 1000k 1000u.")
    public void testCalculateStatisticsZeroP1000K1000U() {
        //Given
        StatisticsCollector statisticsCollector = new StatisticsCollector();
        when(statisticsMock.usersNames()).thenReturn(createUserNamesListN(1000));
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        statisticsCollector.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, statisticsCollector.getUsersCount());
        assertEquals(0, statisticsCollector.getPostsCount());
        assertEquals(1000, statisticsCollector.getCommentsCount());
        assertEquals(0, statisticsCollector.getAveragePostsPerUser());
        assertEquals(1, statisticsCollector.getAverageCommentsPerUser());
        assertEquals(0, statisticsCollector.getAverageCommentsPerPost());
    }
    @Test //7
    @DisplayName("Calculate Statistics --- 1000p 1000k 1000u.")
    public void testCalculateStatistics1000P1000K1000U() {
        //Given
        StatisticsCollector statisticsCollector = new StatisticsCollector();
        when(statisticsMock.usersNames()).thenReturn(createUserNamesListN(1000));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        statisticsCollector.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, statisticsCollector.getUsersCount());
        assertEquals(1000, statisticsCollector.getPostsCount());
        assertEquals(1000, statisticsCollector.getCommentsCount());
        assertEquals(1, statisticsCollector.getAveragePostsPerUser());
        assertEquals(1, statisticsCollector.getAverageCommentsPerUser());
        assertEquals(1, statisticsCollector.getAverageCommentsPerPost());
    }
    @Test //8
    @DisplayName("Calculate Statistics --- 1000p 0k 1000u.")
    public void testCalculateStatistics1000P0K1000U() {
        //Given
        StatisticsCollector statisticsCollector = new StatisticsCollector();
        when(statisticsMock.usersNames()).thenReturn(createUserNamesListN(1000));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        statisticsCollector.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, statisticsCollector.getUsersCount());
        assertEquals(1000, statisticsCollector.getPostsCount());
        assertEquals(0, statisticsCollector.getCommentsCount());
        assertEquals(1, statisticsCollector.getAveragePostsPerUser());
        assertEquals(0, statisticsCollector.getAverageCommentsPerUser());
        assertEquals(0, statisticsCollector.getAverageCommentsPerPost());
    }
    @Test //9
    @DisplayName("Calculate Statistics --- 100 user.")
    public void testCalculateStatistics1000P2000K100U() {
        //Given
        StatisticsCollector statisticsCollector = new StatisticsCollector();
        when(statisticsMock.usersNames()).thenReturn(createUserNamesListN(100));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        //When
        statisticsCollector.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, statisticsCollector.getUsersCount());
        assertEquals(1000, statisticsCollector.getPostsCount());
        assertEquals(2000, statisticsCollector.getCommentsCount());
        assertEquals(10, statisticsCollector.getAveragePostsPerUser());
        assertEquals(20, statisticsCollector.getAverageCommentsPerUser());
        assertEquals(2, statisticsCollector.getAverageCommentsPerPost());
    }
    @Test //10
    @DisplayName("Calculate Statistics --- posts > comments.")
    public void testCalculateStatistics800P300K100U() {
        //Given
        StatisticsCollector statisticsCollector = new StatisticsCollector();
        when(statisticsMock.usersNames()).thenReturn(createUserNamesListN(100));
        when(statisticsMock.postsCount()).thenReturn(800);
        when(statisticsMock.commentsCount()).thenReturn(500);
        //When
        statisticsCollector.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, statisticsCollector.getUsersCount());
        assertEquals(800, statisticsCollector.getPostsCount());
        assertEquals(500, statisticsCollector.getCommentsCount());
        assertEquals(8, statisticsCollector.getAveragePostsPerUser());
        assertEquals(5, statisticsCollector.getAverageCommentsPerUser());
        assertEquals(0.625, statisticsCollector.getAverageCommentsPerPost());
    }
    @Test //11
    @DisplayName("Calculate Statistics --- posts < comments.")
    public void testCalculateStatistics500P800K100U() {
        //Given
        StatisticsCollector statisticsCollector = new StatisticsCollector();
        when(statisticsMock.usersNames()).thenReturn(createUserNamesListN(100));
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(800);
        //When
        statisticsCollector.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, statisticsCollector.getUsersCount());
        assertEquals(500, statisticsCollector.getPostsCount());
        assertEquals(800, statisticsCollector.getCommentsCount());
        assertEquals(5, statisticsCollector.getAveragePostsPerUser());
        assertEquals(8, statisticsCollector.getAverageCommentsPerUser());
        assertEquals(1.6, statisticsCollector.getAverageCommentsPerPost());
    }
}
