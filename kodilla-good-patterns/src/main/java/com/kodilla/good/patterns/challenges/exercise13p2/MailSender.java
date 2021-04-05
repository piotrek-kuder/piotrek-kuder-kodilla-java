package com.kodilla.good.patterns.challenges.exercise13p2;

public class MailSender implements InformationService{

    //@Override
    public void sendMessage(Order order) {

        System.out.println("Sending mail to: " + order.getUserName());
        System.out.println("item: " + order.getItem() + "  amount: " + order.getAmount() + "  total cost: " +(order.getAmount() * order.getPrice()));
    }
}
