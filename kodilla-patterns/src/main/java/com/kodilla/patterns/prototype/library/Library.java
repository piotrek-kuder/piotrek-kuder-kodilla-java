package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Library extends Prototype<Library>{

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library deepClonedLibrary = super.clone();
        deepClonedLibrary.books = new HashSet<>();
        for(Book theBook: books) {
            deepClonedLibrary.getBooks().add(theBook);
        }
        return deepClonedLibrary;
    }

    @Override
    public String toString() {
        String s = "Library: " + name + "\n";
        for (Book book: books) {
            s = s + book.toString() + "\n";
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return name.equals(library.name) && books.equals(library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, books);
    }
}