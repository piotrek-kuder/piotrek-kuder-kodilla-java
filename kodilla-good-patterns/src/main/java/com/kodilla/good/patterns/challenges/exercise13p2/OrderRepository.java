package com.kodilla.good.patterns.challenges.exercise13p2;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    List<Order> orderList = new ArrayList<>();

    public boolean addOrderToRepository(Order order) {

        return orderList.add(order);
    }
}
