package com.kodilla.good.patterns.challenges.exercise13p4;

public class GlutenFreeShopService implements FoodService {

    @Override
    public boolean process(FoodOrder order) {

        System.out.println("\nWelcome customer, GlutenFreeShop is processing your order...");
        return true;
    }
}
