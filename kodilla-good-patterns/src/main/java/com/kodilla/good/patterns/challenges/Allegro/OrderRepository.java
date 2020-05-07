package com.kodilla.good.patterns.challenges.Allegro;

public interface OrderRepository {

    public boolean createOrder(User user, Product product, int quantity);
}
