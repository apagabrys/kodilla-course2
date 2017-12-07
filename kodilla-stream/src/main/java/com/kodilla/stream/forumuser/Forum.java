package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

import static java.time.LocalDate.of;

public final class Forum {
    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum(){
        theUsersList.add(new ForumUser(001,"showMan", Gender.M,
                of(1990, 5, 17), 1));
        theUsersList.add(new ForumUser(002, "XYZ", Gender.F,
                of(1999,12,1),2));
        theUsersList.add(new ForumUser(003, "Lolka", Gender.F,
                of(1994,3,21), 3));
        theUsersList.add(new ForumUser(004, "Trolol", Gender.M,
                of(2001, 3,2), 0));
        theUsersList.add(new ForumUser(005, "JJJ", Gender.M,
                of(1992,3,1), 1));
        theUsersList.add(new ForumUser(006, "KKK", Gender.M,
                of(2001, 2, 1), 1));

    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(theUsersList);
    }
}
