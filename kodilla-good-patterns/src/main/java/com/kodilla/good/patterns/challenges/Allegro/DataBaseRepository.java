package com.kodilla.good.patterns.challenges.Allegro;

public class DataBaseRepository implements OrderRepository {
    @Override
    public boolean createOrder(User user, Product product, int quantity) {
        System.out.println("Zapisuje do bazy danych");
        return true;
    }
}
