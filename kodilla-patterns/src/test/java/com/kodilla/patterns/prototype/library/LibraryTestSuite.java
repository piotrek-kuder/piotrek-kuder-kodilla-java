package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Book book1 = new Book("book1", "author1", LocalDate.of(2001, 10, 1));
        Book book2 = new Book("book2", "author2", LocalDate.of(2002, 11, 3));
        Book book3 = new Book("book3", "author3", LocalDate.of(2003, 12, 9));
        Book book4 = new Book("book4", "author4", LocalDate.of(2004, 1, 21));
        Book book5 = new Book("book5", "author5", LocalDate.of(2005, 2, 28));

        Library library = new Library("Library 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        //shallow copy
        Library shallowCopyLibrary =null;
        try {
            shallowCopyLibrary = library.shallowCopy();
            shallowCopyLibrary.setName("Library 2 shallow copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deep copy
        Library deepCopyLibrary = null;
        try {
            deepCopyLibrary = library.deepCopy();
            deepCopyLibrary.setName("Library 3 deep copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(shallowCopyLibrary);
        System.out.println(deepCopyLibrary);
        assertEquals(4, library.getBooks().size());
        assertEquals(4, shallowCopyLibrary.getBooks().size());
        assertEquals(5, deepCopyLibrary.getBooks().size());
        assertEquals(library.getBooks(), shallowCopyLibrary.getBooks());
        assertNotEquals(library.getBooks(), deepCopyLibrary.getBooks());

    }
}
