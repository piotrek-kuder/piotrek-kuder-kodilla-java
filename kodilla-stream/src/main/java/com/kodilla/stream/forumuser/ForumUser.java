package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int idNumber;
    private final String username;
    private final char gender;
    LocalDate birthDate;
    private final int postsCount;

    public ForumUser(final int idNumber, final String username, final char gender, final int birthYear,
                     final int birthMonth, final int birthDay, final int postsCount) {
        this.idNumber = idNumber;
        this.username = username;
        this.gender = gender;
        this.birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        this.postsCount = postsCount;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public String toString() {
        return "User summary >> ID: " + idNumber + " name: " + username
                + " gender: " + gender + " birth date: " + birthDate + " posts: " + postsCount;
    }
}
