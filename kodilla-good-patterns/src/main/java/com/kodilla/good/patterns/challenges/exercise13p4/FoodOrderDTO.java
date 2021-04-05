package com.kodilla.good.patterns.challenges.exercise13p4;

public class FoodOrderDTO {
    private final FoodOrder order;
    private final boolean isValid;

    public FoodOrderDTO(FoodOrder order, boolean isValid) {
        this.order = order;
        this.isValid = isValid;
    }

    public FoodOrder getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "FoodOrderDTO{" +
                "shop" + order.getManufacturer() +
                "user" + order.getUserName() +
                ", isValid=" + isValid +
                '}';
    }
}
