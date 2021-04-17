package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class LibraryTestSuite {

        @Test
    void testLoadFronDb() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);
        //When
        library.loadFromDb();
        //Then
        //nothing to do
    }

    @Test
    void testSaveFromDb() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);
        //When
        library.saveToDb();
        //Then
        //nothing to do
    }

    @Test
    void testContext() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(LibraryConfig.class);
        //When & Then
        System.out.println("==== Beans list: === >>>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<<< ==== Beans list: ===");
    }
}
