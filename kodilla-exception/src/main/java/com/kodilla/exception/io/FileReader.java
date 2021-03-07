package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("names.txt").getFile());
        //Path path = Paths.get(file.getPath());
        //Path path = Paths.get(file.getPath() + "dd");

        try( Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error occured: " + e);
        } finally {
            System.out.println("Finally - is always done");
        }


        System.out.println(file.getPath());
        System.out.println(classLoader);
    }
}
