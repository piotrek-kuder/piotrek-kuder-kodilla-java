package com.kodilla.good.patterns.challenges.exercise13p2;

public class OrderCreator {

    public Order createOrder() {

        Order order = new Order("User", "item1", 12.5, 3);

        return order;
    }
}
