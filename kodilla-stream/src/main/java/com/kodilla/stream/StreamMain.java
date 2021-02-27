package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
       ExpressionExecutor expressionExecutor = new ExpressionExecutor();

       System.out.println("Calculating with lambdas");
       expressionExecutor.executeExpression(10, 5, (a,b) -> a + b);
       expressionExecutor.executeExpression(10, 5, (a,b) -> a - b);
       expressionExecutor.executeExpression(10, 5, (a,b) -> a * b);
       expressionExecutor.executeExpression(10, 5, (a,b) -> a / b);

       System.out.println("\nCalculating with method reference");
       expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
       expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
       expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
       expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

       //Poem decorator
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("poem to beautify", (poem) -> "ABC" + poem + "ABC");
        poemBeautifier.beautify("poem to beautify", (poem) -> poem.toUpperCase());
        poemBeautifier.beautify("poem to beautify   ", (poem) -> poem.repeat(3));
        poemBeautifier.beautify("longer poem to beautify", (poem) -> poem.replace(" ", "SPACE"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
