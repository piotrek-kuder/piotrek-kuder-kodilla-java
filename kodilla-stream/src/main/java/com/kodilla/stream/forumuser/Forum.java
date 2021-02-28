package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "User1", 'M', 1996, 02,
        20, 27));
        forumUserList.add(new ForumUser(2, "User2", 'F', 1996, 02,
                06, 27));
        forumUserList.add(new ForumUser(3, "User3", 'M', 1996, 02,
                20, 0));
        forumUserList.add(new ForumUser(4, "User4", 'M', 2002, 01,
                20, 27));
        forumUserList.add(new ForumUser(5, "User5", 'F', 1990, 02,
                20, 27));
        forumUserList.add(new ForumUser(6, "User6", 'F', 1996, 07,
                20, 0));
        forumUserList.add(new ForumUser(7, "User7", 'M', 2001, 02,
                28, 27));
        forumUserList.add(new ForumUser(8, "User8", 'F', 1997, 06,
                28, 27));
        forumUserList.add(new ForumUser(9, "User9", 'M', 2001, 02,
                10, 27));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
