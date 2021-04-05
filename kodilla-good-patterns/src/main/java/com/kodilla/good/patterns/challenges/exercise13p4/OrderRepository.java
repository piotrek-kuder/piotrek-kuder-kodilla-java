package com.kodilla.good.patterns.challenges.exercise13p4;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    List<FoodOrder> orderList = new ArrayList<>();

    public boolean addOrderToRepository(FoodOrder order) {

        return orderList.add(order);
    }

    public List<FoodOrder> getOrderList() {
        return orderList;
    }
}
