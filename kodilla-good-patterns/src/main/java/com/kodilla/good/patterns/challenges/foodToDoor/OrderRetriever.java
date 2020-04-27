package com.kodilla.good.patterns.challenges.foodToDoor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRetriever {

    public List<OrderRequest> retrieve() {
        List<OrderRequest> orderRequestList = new ArrayList<>();

        Customer customer = new Customer("JamesPotter");
        FoodProducer foodProducer =  new GlutenFreeShop();
        Map<Product, Integer> productsList = new HashMap<>();
        productsList.put(new GlutenFreeProduct("cookies", "oat biscuits"), 50);
        productsList.put(new GlutenFreeProduct("flour", "coconut flour"), 10);
        productsList.put(new GlutenFreeProduct("rice", "brown rice"),5);

        orderRequestList.add(new OrderRequest(customer, foodProducer, productsList));

        Customer customer1 = new Customer("HansSolo");
        FoodProducer foodProducer1 = new GlutenFreeShop();
        Map<Product, Integer> productsList1 = new HashMap<>();
        productsList.put(new GlutenFreeProduct("cookies", "oat biscuits"), 25);
        productsList.put(new GlutenFreeProduct("flour", "coconut flour"), 5);
        productsList.put(new GlutenFreeProduct("rice", "brown rice"), 10);

        orderRequestList.add(new OrderRequest(customer1, foodProducer1, productsList1));

        Customer customer2 = new Customer("JonGhost");
        FoodProducer foodProducer2 = new HealthyShop();
        Map<Product, Integer> productsList2 = new HashMap<>();
        productsList.put(new MeatProduct("beef", "T-bone"),4); //zapytac sie

        orderRequestList.add(new OrderRequest(customer2, foodProducer2, productsList2));

        return orderRequestList;
    }
}
