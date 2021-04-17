package com.kodilla.spring.library;

import java.util.ArrayList;
import java.util.List;

public final class Library {

    private final List<String> books = new ArrayList<>();
    private LibraryDbController libraryDbController;

    public Library(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library() {
    }

    /*
    @Autowired
    public void setLibraryDbController(final LibraryDbController libraryDbController) {
    this.libraryDbController = libraryDbController;
    }
     */

    public void saveToDb() {
    libraryDbController.saveData();
    }

    public void loadFromDb() {
    libraryDbController.loadData();
    }
}
