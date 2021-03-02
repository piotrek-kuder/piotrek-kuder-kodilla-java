package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        if(numbers.length == 0) {
            System.out.println("List is empty\n");
            return 0;
        } else {
            IntStream.range(0, numbers.length).map(n -> numbers[n]).forEach(System.out::println);
            return IntStream.range(0, numbers.length).map(n -> numbers[n]).average().getAsDouble();
        }
    }
}
