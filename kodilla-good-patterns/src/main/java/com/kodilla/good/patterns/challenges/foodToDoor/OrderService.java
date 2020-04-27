package com.kodilla.good.patterns.challenges.foodToDoor;

import java.util.List;

public class OrderService {

    public void processAllOrders(List<OrderRequest> orderRequests) {

        orderRequests.stream()
                .map(n -> {
                    System.out.println("Processing your order " + n.getCustomer().getName());
                    return n.getFoodProducer().process(n.getCustomer(), n.getProductOrderRequest());
                })
                .forEach(t -> System.out.printf("Order success: " + t + "\n"));
    }
}
