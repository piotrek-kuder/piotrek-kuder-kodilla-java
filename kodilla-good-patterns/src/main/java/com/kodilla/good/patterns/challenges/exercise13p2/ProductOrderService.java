package com.kodilla.good.patterns.challenges.exercise13p2;

public class ProductOrderService {

    private final OrderValidator orderValidator;
    private final OrderRepository orderRepository;
    private final MailSender mailSender;

    public ProductOrderService(OrderValidator orderValidator, OrderRepository orderRepository, MailSender mailSender) {
        this.orderValidator = orderValidator;
        this.orderRepository = orderRepository;
        this.mailSender = mailSender;
    }

    public OrderDTO process(Order order) {
        boolean isValid = orderValidator.validateOrder(order);

        if(isValid) {
            orderRepository.addOrderToRepository(order);
            mailSender.sendMessage(order);
            return new OrderDTO(order, true);
        } else {
            System.out.println("Error");
            return new OrderDTO(order, false);
        }
    }
}
