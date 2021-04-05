package com.kodilla.good.patterns.challenges.exercise13p4;

public class OrderStatus {

    private final OrderRepository orderRepository;
    private final InformationService infoSender;

    public OrderStatus(OrderRepository orderRepository, InformationService infoSender) {
        this.orderRepository = orderRepository;
        this.infoSender = infoSender;
    }

    public FoodOrderDTO summary(FoodOrder order, boolean processingStatus) {

        boolean result;

        if(processingStatus) {
            result = orderRepository.addOrderToRepository(order);
        } else {
            result = false;
        }

        if(result) {
            System.out.println("Succeed");
            infoSender.sendMessage(order);
            return new FoodOrderDTO(order, true);
        } else {
            System.out.println("Failure");
            return new FoodOrderDTO(order, false);
        }
    }
}
