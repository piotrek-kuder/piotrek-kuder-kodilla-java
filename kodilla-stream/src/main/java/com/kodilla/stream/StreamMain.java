package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        /*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

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

        People.getList().stream().filter(s -> s.length() > 11).forEach(System.out::println);

        BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005).collect(Collectors.toList());
        System.out.println("# elements: " + theResultListOfBooks);
        theResultListOfBooks.stream().forEach(System.out::println);

        BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream().filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));
        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream().map(entry -> entry.getKey() + ": " + entry.getValue()).forEach(System.out::println);

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream().filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString).collect(Collectors.joining(",\n", "<<", ">>"));
        System.out.println(theResultStringOfBooks);
         */

        Forum theForum = new Forum();
        LocalDate minimumDate = LocalDate.of(2001, 02, 28);
        Map<Integer, ForumUser> theUsersMap = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M' && forumUser.getPostsCount() > 0 && forumUser.getBirthDate().compareTo(minimumDate) <= 0)
                .collect(Collectors.toMap(ForumUser::getIdNumber, forumUser -> forumUser));

        // only users 1, 7, 9 are in range
        System.out.println("users map size: " + theUsersMap.size());
        theUsersMap.entrySet().stream().forEach(System.out::println);
    }
}
