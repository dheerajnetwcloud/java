package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Java8Files {


    public static void main(String[] args)  {
        Path path = Paths.get("/usr", "local", "bin", "files.txt");
        try {
            Files.createDirectories(path);
            Files.delete(path);
            Files.createDirectory(path);
            boolean isDirectory = Files.isDirectory(path);
            if (isDirectory) {
                System.out.println("Directory exists");
            }
            System.out.println(path);
            Files.delete(path);
            Files.createFile(path);
            System.out.println("Is Directory: "+Files.isDirectory(path));
            Files.delete(path);
            Files.delete(path.getParent());
            Files.delete(path.getParent().getParent());
           // Files.delete(path.getParent().getParent().getParent());



        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
        System.out.println(path);


    }
}
