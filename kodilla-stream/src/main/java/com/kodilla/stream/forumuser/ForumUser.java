package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int ID;
    private final String name;
    private final char sex;
    private final LocalDate birthdayDate;
    private final int postsQty;

    public ForumUser(int ID, String name, char sex, LocalDate birthdayDate, int postsQty) {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.postsQty = postsQty;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getPostsQty() {
        return postsQty;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + birthdayDate +
                ", postsQty=" + postsQty +
                '}';
    }
}
