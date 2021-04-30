package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fileIO {

    public static void printPoem(Path filePath) throws IOException {
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


//  ** Slide 4 **
//  Path filename = Paths.get("/Users/kennethhowell/IdeaProjects/backend_prep/src/fileIO/wcw.txt"); //** absolute path example [used intelliJ 'grab' tool]
        Path filepath = Paths.get("./src/fileIO/wcw.txt"); //** relative ./ from current directory


        System.out.println("filepath = " + filepath); //value of Path object

        System.out.println("Files.exists(filepath) = " + Files.exists(filepath)); //bool did you find this filename?

//        printPoem(filepath); //method from @ DH lecture, utilizes Files class in above method + for loop to set up a formatted string line by line for output

// ~~ Slide 5: Creating Dir/File from scratch ~~

        String directory = "./src/fileIO/data"; //~~ relative path to where we want our directory to go
        String filename = "groceryList.txt"; //~~filename for our desired file

        Path dataDirectory = Paths.get(directory); //Path-ify our string from above
        Path dataFile = Paths.get(directory, filename); //Path-ify the whole shebang (directory + filename);

        System.out.println("dataFile = " + dataFile); //et voila!

        if(Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if(Files.notExists(dataFile)) {
            Files.createFile(dataFile);
        }

// $$ Slide 6 $$
        Path groceriesPath = Paths.get(directory, filename); //Paths.get(".src/fileIO/data", "groceryList.txt")
        System.out.println("groceriesPath = " + groceriesPath);
        System.out.println("Files.exists(groceriesPath) = " + Files.exists(groceriesPath));

        List<String>groceryList = Arrays.asList("coffee", "milk", "sugar"); //.asList > List of Strings datatype var named 'groceryList' to hold
        System.out.println("groceryList = " + groceryList); //mira, there's our list

        Files.write(Paths.get(directory, filename), groceryList); //now . . go check out groceries.txt! :)

//!! Slide 7 !!

        List<String>printList = Files.readAllLines(groceriesPath);

        for(int i = 0; i < printList.size(); i++){
            System.out.println((i + 1) + ": " + groceryList.get(i));
        } //partial implementation of full idea from above printPoem

        Files.write(groceriesPath, Arrays.asList("eggs"), StandardOpenOption.APPEND);

        List<String>adjustedPrintList = Files.readAllLines(groceriesPath);

        System.out.println();
        for(int i = 0; i < adjustedPrintList.size(); i++){
            System.out.println((i + 1) + ": " + adjustedPrintList.get(i));
        } //q? why only one egg? a: look at flow of application > we overwrite on 66 any content with the base three grocery items, then come down here and always append onto that first list of three

    //^^ Slide 8 ^^

        List<String> currentLines = Files.readAllLines(groceriesPath);
        List<String> newList = new ArrayList<>();

        for (String line : currentLines){
            if(line.equals("milk")){ //look for a match line by line of this string
                newList.add("cream"); //add "cream" and skip to the top of the loop (continue)
                continue;
            }
            newList.add(line); //otherwise carry on as expected and fill in our new list with old items
        }

        Files.write(groceriesPath, newList);
        System.out.println();
        for(int i = 0; i < newList.size(); i++){
            System.out.println((i + 1) + ": " + newList.get(i));
        }
    }



}
