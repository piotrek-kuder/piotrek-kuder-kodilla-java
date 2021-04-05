package com.kodilla.good.patterns.challenges.exercise13p4;

public class HealthyShopService implements FoodService {

    @Override
    public boolean process(FoodOrder order) {

        System.out.println("\nWelcome customer, HealthyShop is processing your order...");
        return true;
    }
}
