package com.kodilla.testing.forum.statistics;

public class StatisticsCollector {

    //dummy data
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {

        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        System.out.println("P " + postsCount + "   K" + commentsCount + "   U " + usersCount + "\n");

        if(usersCount == 0) {
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
        } else {
            averagePostsPerUser = (double)postsCount/(double)usersCount;
            averageCommentsPerUser = (double)commentsCount/(double)usersCount;
        }

        if (postsCount == 0) {
            averageCommentsPerPost = 0;
        } else {
            averageCommentsPerPost = (double)commentsCount/(double)postsCount;
        }
    }

    public void showStatistics() {
        //
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
