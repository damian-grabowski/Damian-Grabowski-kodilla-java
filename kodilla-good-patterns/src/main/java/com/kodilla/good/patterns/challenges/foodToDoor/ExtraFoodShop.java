package com.kodilla.good.patterns.challenges.foodToDoor;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExtraFoodShop implements FoodProducer {

    private Map<Product, Integer> productsList;

    public ExtraFoodShop() {
        productsList = createProductsList();
    }

    private Map<Product, Integer> createProductsList() {
        Map<Product,Integer> productsList = new HashMap<>();

        productsList.put(new MeatProduct("beef", "T-bone"), 40);
        productsList.put(new MeatProduct("beef", "Porterhouse Steak"), 25);

        return productsList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productOrders) {

        for (Map.Entry<Product, Integer> entry : productOrders.entrySet()) {
            Optional<Integer> productQuantity = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQuantity.orElse(0) < entry.getValue()) {
                System.out.println("Products is unavailable.");
                return false;
            }
        }
        return true;
    }
}
