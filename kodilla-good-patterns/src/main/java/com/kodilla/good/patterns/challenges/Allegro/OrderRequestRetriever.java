package com.kodilla.good.patterns.challenges.Allegro;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Harry", "Potter");
        Product product = new Product("wand", 10);
        int quantity = 1;

        return new OrderRequest(user, product, quantity);
    }
}
