package com.kodilla.good.patterns.challenges.foodToDoor;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

public class HealthyShop implements FoodProducer {
    private Map<Product, Integer> productsList;    //pole klasy

    public HealthyShop() {                         // konstruktor
        productsList = createProductsList();
    }

    private Map<Product, Integer> createProductsList() {

        Map<Product, Integer> products = new HashMap<>();

        products.put(new GlutenFreeProduct("pasta", "Noodles made from rice flour"), 5);
        products.put(new GlutenFreeProduct("corn crisps", "Crisps made from corn flour"), 23);

        return products;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrder) {
        return (productsOrder.size() >= 2 && isProductAvailible(productsOrder));

    }

    private boolean isProductAvailible(Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            int productQuantity = entry.getValue();
            Random random = new Random();
            if (productQuantity > random.nextInt(50)) {
                System.out.println("Gluten Free Shop: Product is unavailable.");
                return false;
            }
        }
        return true;

    }
}
