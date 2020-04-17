package com.kodilla.good.patterns.challenges.Allegro;

public class ProductOrder {

    private User user;
    private Product product;
    private int quantity;
    private int orderNumber;

    public ProductOrder(User user, Product product, int quantity, int orderNumber) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.orderNumber = orderNumber;
    }


}
