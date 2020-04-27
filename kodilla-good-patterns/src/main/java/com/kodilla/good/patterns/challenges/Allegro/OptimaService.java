package com.kodilla.good.patterns.challenges.Allegro;

public class OptimaService implements OrderService {

    @Override
    public boolean order(User user, Product product, int quantity) {
        System.out.println("Zamawiam towar");
        return true;
    }
}
