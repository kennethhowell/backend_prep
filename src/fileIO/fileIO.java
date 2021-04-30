package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class fileIO {



    public static void printFileContents(Path filePath) throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath);
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }

    public static void main(String[] args) throws IOException {
//        Path filename = Paths.get("/Users/kennethhowell/IdeaProjects/backend_prep/src/fileIO/wcw.txt"); //absolute path [used intelliJ 'grab' tool]
        Path filename = Paths.get("./src/fileIO/wcw.txt"); //relative ./ from current directory


        System.out.println("filename = " + filename); //value of Path object

        System.out.println("Files.exists(filename) = " + Files.exists(filename)); //bool did you find this filename?

        printFileContents(filename); //method from @ DH lecture, utilizes Files class in above method + for loop to set up a formatted string line by line for output
    }



}
