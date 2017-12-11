package com.com.kodilla.testing.com.kodilla.testing.forum.statistics;

import com.kodilla.testing.com.kodilla.testing.forum.statistics.ForumCalculations;
import com.kodilla.testing.com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumCalculationsTestSuite {
    // Test 1: gdy liczba postów = 0
    @Test
    public void testCalculateAdvStatisticsPosts0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfNames = new ArrayList<String>();

        for (int i = 0; i < 100; i++) {
            listOfNames.add("Name " + i);
        }

        int posts = 0;
        int comments = 200;

        when(statisticsMock.usersNames()).thenReturn(listOfNames);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumCalculations forumCalculations = new ForumCalculations(statisticsMock);
        forumCalculations.calculateAdvStatistics(statisticsMock);

        //When
        double testAvgPostsPerUser = forumCalculations.averagePostsPerUser;
        double testAvgCommentsPerUser = forumCalculations.averageCommentsPerUser;
        double testAvgCommentsPerPost = forumCalculations.averageCommentsPerPost;

        //Then
        Assert.assertEquals(0.0, testAvgPostsPerUser, 0);
        Assert.assertEquals(2.0, testAvgCommentsPerUser, 0);
        Assert.assertEquals(0.0, testAvgCommentsPerPost, 0);
    }

    // Test 2: gdy liczba postów = 1000
    @Test
    public void testCalculateAdvStatisticsPosts1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfNames = new ArrayList<String>();

        for (int i = 0; i < 100; i++) {
            listOfNames.add("Name " + i);
        }

        int posts = 1000;
        int comments = 200;

        when(statisticsMock.usersNames()).thenReturn(listOfNames);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumCalculations forumCalculations = new ForumCalculations(statisticsMock);
        forumCalculations.calculateAdvStatistics(statisticsMock);

        //When
        double testAvgPostsPerUser = forumCalculations.averagePostsPerUser;
        double testAvgCommentsPerUser = forumCalculations.averageCommentsPerUser;
        double testAvgCommentsPerPost = forumCalculations.averageCommentsPerPost;

        //Then
        Assert.assertEquals(10.0, testAvgPostsPerUser, 0);
        Assert.assertEquals(2.0, testAvgCommentsPerUser, 0);
        Assert.assertEquals(0.2, testAvgCommentsPerPost, 0);
    }

    //Test 3: gdy liczba komentarzy = 0
    @Test
    public void testCalculateAdvStatisticsComments0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfNames = new ArrayList<String>();

        for (int i = 0; i < 100; i++) {
            listOfNames.add("Name " + i);
        }

        int posts = 1000;
        int comments = 0;

        when(statisticsMock.usersNames()).thenReturn(listOfNames);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumCalculations forumCalculations = new ForumCalculations(statisticsMock);
        forumCalculations.calculateAdvStatistics(statisticsMock);

        //When
        double testAvgPostsPerUser = forumCalculations.averagePostsPerUser;
        double testAvgCommentsPerUser = forumCalculations.averageCommentsPerUser;
        double testAvgCommentsPerPost = forumCalculations.averageCommentsPerPost;

        //Then
        Assert.assertEquals(10.0, testAvgPostsPerUser, 0);
        Assert.assertEquals(0.0, testAvgCommentsPerUser, 0);
        Assert.assertEquals(0.0, testAvgCommentsPerPost, 0);
    }

    //Test 4: gdy liczba komentarzy < liczba postów
    @Test
    public void testCalculateAdvStatisticsCommentsPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfNames = new ArrayList<String>();

        for (int i = 0; i < 100; i++) {
            listOfNames.add("Name " + i);
        }

        int posts = 1000;
        int comments = 500;

        when(statisticsMock.usersNames()).thenReturn(listOfNames);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumCalculations forumCalculations = new ForumCalculations(statisticsMock);
        forumCalculations.calculateAdvStatistics(statisticsMock);

        //When
        double testAvgPostsPerUser = forumCalculations.averagePostsPerUser;
        double testAvgCommentsPerUser = forumCalculations.averageCommentsPerUser;
        double testAvgCommentsPerPost = forumCalculations.averageCommentsPerPost;

        //Then
        Assert.assertEquals(10.0, testAvgPostsPerUser, 0);
        Assert.assertEquals(5.0, testAvgCommentsPerUser, 0);
        Assert.assertEquals(0.5, testAvgCommentsPerPost, 0);
    }

    //Test 5: gdy liczba komentarzy > liczba postów
    @Test
    public void testCalculateAdvStatisticsCommentsPosts2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfNames = new ArrayList<String>();

        for (int i = 0; i < 100; i++) {
            listOfNames.add("Name " + i);
        }

        int posts = 500;
        int comments = 1000;

        when(statisticsMock.usersNames()).thenReturn(listOfNames);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumCalculations forumCalculations = new ForumCalculations(statisticsMock);
        forumCalculations.calculateAdvStatistics(statisticsMock);

        //When
        double testAvgPostsPerUser = forumCalculations.averagePostsPerUser;
        double testAvgCommentsPerUser = forumCalculations.averageCommentsPerUser;
        double testAvgCommentsPerPost = forumCalculations.averageCommentsPerPost;

        //Then
        Assert.assertEquals(5.0, testAvgPostsPerUser, 0);
        Assert.assertEquals(10.0, testAvgCommentsPerUser, 0);
        Assert.assertEquals(2.0, testAvgCommentsPerPost, 0);
    }

    //Test 6: gdy liczba użytkowników = 0
    @Test
    public void testCalculateAdvStatisticsUsers0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfNames = new ArrayList<String>();

        int posts = 500;
        int comments = 1000;

        when(statisticsMock.usersNames()).thenReturn(listOfNames);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumCalculations forumCalculations = new ForumCalculations(statisticsMock);
        forumCalculations.calculateAdvStatistics(statisticsMock);

        //When
        double testAvgPostsPerUser = forumCalculations.averagePostsPerUser;
        double testAvgCommentsPerUser = forumCalculations.averageCommentsPerUser;
        double testAvgCommentsPerPost = forumCalculations.averageCommentsPerPost;

        //Then
        Assert.assertEquals(0.0, testAvgPostsPerUser, 0);
        Assert.assertEquals(0.0, testAvgCommentsPerUser, 0);
        Assert.assertEquals(2.0, testAvgCommentsPerPost, 0);
    }
    //Test 7: gdy liczba użytkowników = 1000
    @Test
    public void testCalculateAdvStatisticsUsers1000(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfNames = new ArrayList<String>();

        for (int i = 0; i < 1000; i++) {
            listOfNames.add("Name " + i);
        }

        int posts = 500;
        int comments = 1000;

        when(statisticsMock.usersNames()).thenReturn(listOfNames);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumCalculations forumCalculations = new ForumCalculations(statisticsMock);
        forumCalculations.calculateAdvStatistics(statisticsMock);

        //When
        double testAvgPostsPerUser = forumCalculations.averagePostsPerUser;
        double testAvgCommentsPerUser = forumCalculations.averageCommentsPerUser;
        double testAvgCommentsPerPost = forumCalculations.averageCommentsPerPost;

        //Then
        Assert.assertEquals(0.5, testAvgPostsPerUser, 0);
        Assert.assertEquals(1.0, testAvgCommentsPerUser, 0);
        Assert.assertEquals(2.0, testAvgCommentsPerPost, 0);
    }
}
