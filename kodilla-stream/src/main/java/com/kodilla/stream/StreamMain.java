package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
       /*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

       System.out.println("Calculating with lambdas");
       expressionExecutor.executeExpression(10, 5, (a,b) -> a + b);
       expressionExecutor.executeExpression(10, 5, (a,b) -> a - b);
       expressionExecutor.executeExpression(10, 5, (a,b) -> a * b);
       expressionExecutor.executeExpression(10, 5, (a,b) -> a / b);

        System.out.println("Calculating with method reference");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
 */
        //Poem decorator
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("poem to beautify", (poem) -> "ABC" + poem + "ABC");
        poemBeautifier.beautify("poem to beautify", (poem) -> poem.toUpperCase());
        poemBeautifier.beautify("poem to beautify   ", (poem) -> poem.repeat(3));
        poemBeautifier.beautify("longer poem to beautify", (poem) -> poem.replace(" ", "SPACE"));
    }
}
