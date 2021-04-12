package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LibraryTestSuite {

    @Autowired
    private Library library;

    @Test
    void testLoadFronDb() {
        //Given
        //ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //Library library = context.getBean(Library.class);
        //When
        library.loadFromDb();
        //Then
        //nothing to do
    }

    @Test
    void testSaveFromDb() {
        //Given
        //ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //Library library = context.getBean(Library.class);
        //When
        library.saveToDb();
        //Then
        //nothing to do
    }
}
