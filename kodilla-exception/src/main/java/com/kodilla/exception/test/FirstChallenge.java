package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException();
        }
        return a/b;
    }

    public static void main(String[] args) {

        int a = 3;
        int b = 0;
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(a, b);
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println("Error occured: " + exception);
        } finally {
            System.out.println("Arguments: a = " + a + " b = " + b);
        }
    }
}
