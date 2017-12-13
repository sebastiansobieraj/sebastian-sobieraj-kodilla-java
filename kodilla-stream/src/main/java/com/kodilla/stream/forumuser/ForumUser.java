package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userId;
    private final String user;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postsNumber;

    public ForumUser(int userId, String user, char sex, int year, int month, int day, int postsNumber) {
        this.userId = userId;
        this.user = user;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.postsNumber = postsNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String getUser() {
        return user;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", user='" + user + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
