package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum() {
        theForumUsersList.add(new ForumUser(1, "User1", 'M', 1991, 12, 5, 45));
        theForumUsersList.add(new ForumUser(2, "User2", 'M', 1982, 5, 12, 100));
        theForumUsersList.add(new ForumUser(3, "User3", 'F', 1988, 7, 24, 2));
        theForumUsersList.add(new ForumUser(4, "User4", 'M', 1999, 8, 2, 32));
        theForumUsersList.add(new ForumUser(5, "User5", 'F', 1997, 9, 4, 0));
        theForumUsersList.add(new ForumUser(6, "User6", 'F', 1989, 8, 14, 56));
        theForumUsersList.add(new ForumUser(7, "User7", 'M', 1995, 1, 16, 123));
        theForumUsersList.add(new ForumUser(8, "User8", 'M', 1997, 3, 19, 456));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUsersList);
    }
}
