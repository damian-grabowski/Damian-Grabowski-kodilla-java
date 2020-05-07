package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "Tomek", 'M', LocalDate.parse("1995-10-20"), 26));
        theUserList.add(new ForumUser(2, "Barbara", 'F', LocalDate.parse("1992-04-16"), 13));
        theUserList.add(new ForumUser(3, "Kuba", 'M', LocalDate.parse("1990-08-07"), 5));
        theUserList.add(new ForumUser(4, "Ewelina", 'F', LocalDate.parse("1989-01-31"), 11));
        theUserList.add(new ForumUser(5, "Krzysztof", 'M', LocalDate.parse("2000-12-08"), 14));
        theUserList.add(new ForumUser(6, "Mateusz", 'M', LocalDate.parse("1993-03-20"), 4));
        theUserList.add(new ForumUser(7, "Beata", 'F', LocalDate.parse("1980-08-16"), 3));
        theUserList.add(new ForumUser(8, "Veis", 'M', LocalDate.parse("1996-09-07"), 5));
        theUserList.add(new ForumUser(9, "Anna", 'F', LocalDate.parse("1991-04-25"), 14));
        theUserList.add(new ForumUser(10, "Aleksandra", 'F', LocalDate.parse("2001-10-08"), 17));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}
