package com.kodilla.testing.collection;

import java.util.*;

//odd = nieparzysty
public class OddNumberExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = new LinkedList<>();

        if(numbers.size() != 0) {

            System.out.println("Tested list size: " + numbers.size());

            for(Integer number: numbers) {
                if((number % 2) == 0) {
                    evenNumbers.add(number);
                }
            }
            System.out.println("Even numbers list size: " + evenNumbers.size());
            return evenNumbers;
        } else {
            System.out.println("List is empty");
            return numbers;
        }
    }
}
