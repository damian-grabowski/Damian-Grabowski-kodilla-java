package com.kodilla.good.patterns.challenges.foodToDoor;

import java.util.*;

public class GlutenFreeShop implements FoodProducer {

    private Map<Product, Integer> productsList;
    private List<Customer> specialList;

    public GlutenFreeShop() {
        productsList = createProductsList();
        specialList = createSpecialList();
    }

    private Map<Product, Integer> createProductsList() {

        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new GlutenFreeProduct("cookies", "oat biscuits"), 61);
        productsList.put(new GlutenFreeProduct("flour", "coconut flour"), 5);
        productsList.put(new GlutenFreeProduct("rice", "brown rice"), 15);

        return productsList;

    }

    private List<Customer> createSpecialList() {
        List<Customer> specialList = new ArrayList<>();
        specialList.add(new Customer("JamesPotter"));
        return specialList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productOrders) {
        return (!specialList.contains(customer) && isProductAvailible(productOrders));  //return false;
    }

    private boolean isProductAvailible(Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQuantity = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQuantity.orElse(0) < entry.getValue()) {
                System.out.println("Gluten Free Shop: Product is anavailable");
                return false;
            }
        }
        return  true;
    }
}
