package com.kodilla.testing.forum.statistics;

public class StatisticsCollector {
    private Statistics statistics;
    int usersCount = 4;
    int postsCount = 4;
    int commentsCount = 4;
    double averagePostsPerUser = 4;
    double averageCommentsPerUser = 4;
    double averageCommentsPerPost = 4;

    public StatisticsCollector(Statistics statistics) {
        this.statistics = statistics;
    }

    void calculateAdvStatistics(Statistics statistics) {

        /*this.usersCount = statistics.usersNames().size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();

         */
    }

    public void showStatistics() {

    }
}
