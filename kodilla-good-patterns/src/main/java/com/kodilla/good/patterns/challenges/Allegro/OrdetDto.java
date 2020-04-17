package com.kodilla.good.patterns.challenges.Allegro;

public class OrdetDto {

    public User user;
    public boolean isOrdered;

    public OrdetDto(final User user, final boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
