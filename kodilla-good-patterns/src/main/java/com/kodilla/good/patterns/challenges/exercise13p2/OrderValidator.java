package com.kodilla.good.patterns.challenges.exercise13p2;

public class OrderValidator {

    private final int warehauseStock = 10;

    public boolean validateOrder(Order order) {

        if(order.getAmount() > 0 && order.getAmount() <= warehauseStock) {
            System.out.println("Items in stock");
            return true;
        } else {
            System.out.println("Error. Items not in stock");
            return false;
        }

    }
}
