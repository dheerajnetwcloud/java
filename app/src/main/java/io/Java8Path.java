package io;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Java8Path {
    public static void main(String[] args) {

        //This is a Java 8 example
        //Path class contains the reference of the path, it does not mean there is a file exist.
        Path path = Paths.get("/usr", "local", "bin");
        System.out.println("Path: " + path);
        System.out.println("Root: " + path.getRoot());
        System.out.println("Parent: " + path.getParent());
        System.out.println("FileName: " + path.getFileName());
        System.out.println("File: " + path.toFile());
        System.out.println("Absolute: " + path.toAbsolutePath());
        System.out.println("URI: " + path.toUri());

        Path sibling = path.resolveSibling("lib");
        System.out.println(sibling);

        for(Path p : path.toAbsolutePath()) {
            System.out.println(p);
        }

        Path normalized = Paths.get("/usr/local/./bin/../..").normalize();
        System.out.println(normalized);

    }

}
