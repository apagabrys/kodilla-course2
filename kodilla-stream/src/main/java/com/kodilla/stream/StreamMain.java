package com.kodilla.stream;


import com.kodilla.stream.book.Book;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.Gender;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getGender().equals(Gender.M))
                .filter(forumUser -> forumUser.getPostQuantity() >= 1)
                .filter(forumUser -> forumUser.getAge() >= 20 )
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
