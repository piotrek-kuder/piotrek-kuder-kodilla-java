package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String poem, PoemDecorator poemDecorator) {
        String beautyPoem = poemDecorator.decorate(poem);
        System.out.println("before decoration:  " + poem);
        System.out.println("after decoration:  " + beautyPoem + "\n");
        return beautyPoem;
    }
}
