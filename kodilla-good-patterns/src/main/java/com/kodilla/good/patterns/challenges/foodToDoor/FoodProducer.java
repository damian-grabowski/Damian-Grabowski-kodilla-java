package com.kodilla.good.patterns.challenges.foodToDoor;

import java.util.Map;

interface FoodProducer {

    boolean process(Customer customer, Map<Product, Integer> productOrders);
}
