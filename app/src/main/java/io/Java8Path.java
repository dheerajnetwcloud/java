package io;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Java8Path {
    public static void main(String[] args) {
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(Paths.get("."))) {
            for (Path path : ds) {
                System.out.println(path.getFileName());
            }
        } catch (IOException e) {
            System.err.println("Error reading directory: " + e.getMessage());
        }

        try {
            Path path = Paths.get("build.gradle");
            String content = new String(Files.readAllBytes(path));
            System.out.println("Content of build.gradle:\n" + content);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

}
