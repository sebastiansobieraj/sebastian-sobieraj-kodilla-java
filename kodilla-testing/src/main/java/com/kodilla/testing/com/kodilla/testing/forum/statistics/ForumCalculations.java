package com.kodilla.testing.com.kodilla.testing.forum.statistics;

public class ForumCalculations {
    public Statistics statistics;
    public int forumUsersNumber;
    public int postsNumber;
    public int commentsNumber;
    public double averagePostsPerUser;
    public double averageCommentsPerUser;
    public double averageCommentsPerPost;

    public ForumCalculations(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        forumUsersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

        if (postsNumber == 0 || forumUsersNumber == 0) {
            averagePostsPerUser = 0;
        } else {
            averagePostsPerUser = (double) postsNumber / (double) forumUsersNumber;
        }
        if (commentsNumber == 0 || forumUsersNumber == 0) {
            averageCommentsPerUser = 0;
        } else {
            averageCommentsPerUser = (double) commentsNumber / (double) forumUsersNumber;
        }
        if (commentsNumber == 0 || postsNumber == 0) {
            averageCommentsPerPost = 0;
        } else {
            averageCommentsPerPost = (double) commentsNumber / (double) postsNumber;
        }
    }

    public void ShowStatistics() {
        System.out.println("Number of Users: " + forumUsersNumber
                + "\n" + "Number of Posts: " + postsNumber
                + "\n" + "Number of Comments: " + commentsNumber
                + "\n" + "Average number of posts per user: " + averagePostsPerUser
                + "\n" + "Average number of comments per user: " + averageCommentsPerUser
                + "\n" + "Average number of comments per post: " + averageCommentsPerPost);
    }

}
