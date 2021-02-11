package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        if(calculator.add(55, -13)==(55 + (- 13))) {
            System.out.println("Testing \"add\" method: OK");
        } else {
            System.out.println("Testing \"add\" method: ERROR");
        }

        if(calculator.subtract(55, -13)==(55 - (- 13))) {
            System.out.println("Testing \"subtract\" method: OK");
        } else {
            System.out.println("Testing \"subtract\" method: ERROR");
        }
    }
}
