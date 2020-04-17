package com.kodilla.good.patterns.challenges.Allegro;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrdetDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(),
                orderRequest.getQuantity());

        if(isOrdered){
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(),
                    orderRequest.getQuantity());
            return new OrdetDto(orderRequest.getUser(), true);
        } else {
            return new OrdetDto(orderRequest.getUser(), false);
        }
    }
}
