package com.kodilla.good.patterns.challenges.foodToDoor;

import java.util.List;

public class FoodAp {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        List<OrderRequest> orders = orderRetriever.retrieve();
        OrderService orderService = new OrderService();
        orderService.processAllOrders(orders);
    }
}
