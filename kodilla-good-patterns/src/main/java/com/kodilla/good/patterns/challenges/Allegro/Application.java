package com.kodilla.good.patterns.challenges.Allegro;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new EmailService(), new OptimaService(), new DataBaseRepository());
        productOrderService.process(orderRequest);

    }
}
