package com.kodilla.good.patterns.challenges.exercise13p2;

public class OrderDTO {
    private Order order;
    private boolean isValid;

    public OrderDTO(Order order, boolean isValid) {
        this.order = order;
        this.isValid = isValid;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isValid() {
        return isValid;
    }
}
