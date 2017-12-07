package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final Gender gender;
    private final LocalDate dateOfBirth;
    private final int postQuantity;

    public ForumUser(int userID, String userName, Gender gender, LocalDate dateOfBirth, int postQuantity) {
        this.userID = userID;
        this.userName = userName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.postQuantity = postQuantity;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge(){
        LocalDate today = LocalDate.now();
        LocalDate birthday = getDateOfBirth();
        Period p = Period.between(birthday,today);
        return p.getYears();
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", postQuantity=" + postQuantity +
                '}';
    }
}
