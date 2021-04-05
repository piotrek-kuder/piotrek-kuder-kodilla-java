package com.kodilla.good.patterns.challenges.exercise13p2;

public class Order {

    private String userName;
    private String item;
    private double price;
    private int amount;

    public Order(String userName, String item, double price, int amount) {
        this.userName = userName;
        this.item = item;
        this.price = price;
        this.amount = amount;
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
