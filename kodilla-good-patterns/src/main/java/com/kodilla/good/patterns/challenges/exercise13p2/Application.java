package com.kodilla.good.patterns.challenges.exercise13p2;

public class Application {

    public static void main(String[] args) {

        OrderCreator orderCreator = new OrderCreator();
        Order order = orderCreator.createOrder();

        ProductOrderService productOrderService = new ProductOrderService(new OrderValidator(), new OrderRepository(), new MailSender());
        productOrderService.process(order);


    }


}
