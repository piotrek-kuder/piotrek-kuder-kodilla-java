package com.kodilla.good.patterns.challenges.exercise13p4;

public class FoodOrder {

    private final String manufacturer;
    private final String userName;
    private final String item;
    private final double price;
    private final int amount;

    public FoodOrder(String manufacturer, String userName, String item, double price, int amount) {
        this.manufacturer = manufacturer;
        this.userName = userName;
        this.item = item;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "FoodOrder{" +
                "manufacturer='" + manufacturer + '\'' +
                ", userName='" + userName + '\'' +
                ", item='" + item + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getUserName() {
        return userName;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}
