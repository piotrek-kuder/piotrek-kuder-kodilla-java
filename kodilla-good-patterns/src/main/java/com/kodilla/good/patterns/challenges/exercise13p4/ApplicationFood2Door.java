package com.kodilla.good.patterns.challenges.exercise13p4;

import java.util.ArrayList;
import java.util.List;

public class ApplicationFood2Door {
    public static void main(String[] args) {

        OrderRepository orderRepository = new OrderRepository();
        OrderStatus orderStatus = new OrderStatus(orderRepository, new MailSender());
        ExtraFoodShopService extraFoodShopService = new ExtraFoodShopService();
        HealthyShopService healthyShopService = new HealthyShopService();
        GlutenFreeShopService glutenFreeShopService = new GlutenFreeShopService();

        boolean processingStatus = false;

        FoodOrder order1 = new FoodOrder("ExtraFoodShop", "Valery", "fried crickets", 0.21, 100);
        FoodOrder order2 = new FoodOrder("HealthyShop", "Yatsu", "lemongrass", 2, 12);
        FoodOrder order3 = new FoodOrder("GlutenFreeShop", "Hana", "potatoes", 1.99, 5);
        FoodOrder order4 = new FoodOrder("ExtraFoodShop", "Ivan", "shark meat", 15.99, 2);
        FoodOrder order5 = new FoodOrder("HealthyShop", "Beny", "brown rice", 4.5, 3);
        FoodOrder order6 = new FoodOrder("GlutenFreeShop", "Julia", "bread", 2.99, 1);
        FoodOrder order7 = new FoodOrder("errorShop", "Johan", "oil", 2.99, 1);

        List<FoodOrder> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        orderList.add(order5);
        orderList.add(order6);
        orderList.add(order7);

        List<FoodOrderDTO> orderDTOList = new ArrayList<>();

        for(FoodOrder order: orderList) {
            switch (order.getManufacturer()) {
                case "ExtraFoodShop":
                    processingStatus = extraFoodShopService.process(order);
                    orderDTOList.add(orderStatus.summary(order, processingStatus));
                    break;
                case "HealthyShop":
                    processingStatus = healthyShopService.process(order);
                    orderDTOList.add(orderStatus.summary(order, processingStatus));
                    break;
                case "GlutenFreeShop":
                    processingStatus = glutenFreeShopService.process(order);
                    orderDTOList.add(orderStatus.summary(order, processingStatus));
                    break;
                default:
                    System.out.println("\nError - couldn't find food manufacturer:  " + order.getManufacturer() + "\n");
                    break;
            }
        }

        List<FoodOrder> orderRepositoryList = orderRepository.getOrderList();

        for(FoodOrder order: orderRepositoryList) {
            System.out.println(order);
        }

        for(FoodOrderDTO DTOorder: orderDTOList) {
            System.out.println(DTOorder);
        }
    }
}
