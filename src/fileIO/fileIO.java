package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class fileIO {

    public static void printFileContents(Path filePath) throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath); //We need List as .readAllLines returns List datatype
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }

    public static void main(String[] args) throws IOException {
        //Paths class = static methods to obtain filepaths (Path class)
        //Path interface = abstracts away differences between Win && MacOS [vs. trying to do everything with strings]
        //Files class - Files.methods() for manipulating / interacting with files ^ utilizing paths above
        //File class object{} representation of a file


//  ** Slide 4
//  Path filename = Paths.get("/Users/kennethhowell/IdeaProjects/backend_prep/src/fileIO/wcw.txt"); //** absolute path example [used intelliJ 'grab' tool]
        Path filepath = Paths.get("./src/fileIO/wcw.txt"); //** relative ./ from current directory


        System.out.println("filepath = " + filepath); //value of Path object

        System.out.println("Files.exists(filepath) = " + Files.exists(filepath)); //bool did you find this filename?

//        printFileContents(filepath); //method from @ DH lecture, utilizes Files class in above method + for loop to set up a formatted string line by line for output

// ~~ Slide 5: Creating Dir/File from scratch ~~

        String directory = "./src/fileIO/data"; //~~ relative path to where we want our directory to go
        String filename = "info.txt"; //~~filename for our desired file

        Path dataDirectory = Paths.get(directory); //Path-ify our string from above
        Path dataFile = Paths.get(directory, filename); //Path-ify the whole shebang (directory + filename);

        System.out.println("dataFile = " + dataFile); //et voila!

        if(Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if(Files.notExists(dataFile)) {
            Files.createFile(dataFile);
        }

    }



}
