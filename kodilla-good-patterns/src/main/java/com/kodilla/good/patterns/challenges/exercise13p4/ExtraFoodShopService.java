package com.kodilla.good.patterns.challenges.exercise13p4;

public class ExtraFoodShopService implements FoodService {

    @Override
    public boolean process(FoodOrder order) {

        System.out.println("\nWelcome customer, ExtraFoodShop is processing your order...");
        return true;

    }
}
