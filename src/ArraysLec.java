import java.util.Arrays;

public class ArraysLec {

    public static void main(String[] args) {

        //~*~ Welcome to Java Arrays[] ~*~
        //Key differences coming from JS: a. arrays have a fixed length that we **must** set, b. arrays have a set data type [with all elements matching].

        //TODO Together: Let's set up our first array - an array of prices with a double datatype.

        //double[] prices;

        //datatype[] varName (gets us going, but we'd still need to take another step to give the array a length)

        //prices = new double[4];

        //We can set it up like th:
        double[] prices = new double[4];


        System.out.println("prices[0] = " + prices[0]);
        System.out.println("prices[1] = " + prices[1]);
        System.out.println("prices[2] = " + prices[2]);
        System.out.println("prices[3] = " + prices[3]);

        //TODO Together: Nice! So, we can set up an array with a literal (prices = new double[4], diceSides = new int[6], groceryList = new String[10]), but that's not all. We can also use a constant or variable!
        final int diceSides = 6;
        int[] sidesArray = new int[diceSides];

        int numGroceries = 10;
        String[] groceryList = new String[numGroceries];

        //~*~ Array Elements ~*~

        //Similarities from JS: Array elements are referred to by their Array[index] beginning with 0.
        //Elements also come with default values = 0/0.0, false, \0, or null depending on the type.

        //TODO Together: Let's see some of these defaults in action from our prior examples.

        System.out.println("prices[0] = " + prices[0]); //default 0.0
        System.out.println("sidesArray[0] = " + sidesArray[0]); //default 0
        System.out.println("groceryList[0] = " + groceryList[0]); // null [Strings are what in Java?]

        //TODO Together: What if we try to refer to an index beyond what we have set up?

        // System.out.println("sidesArray[7] = " + sidesArray[7]); //We will get an error!

        //TODO Together: We can use the ARRAY INITIALIZER to set up not only our array and its length, but the elements inside as well!

        String[] cohorts = {"Marco", "Neptune", "Oberon", "Polaris"};

        System.out.println("Hey, good to see you today " + cohorts[0] + " students! Did you know our upcoming cohort is going to be named " + cohorts[3] + "?");

        //TODO: Build your first Java array! Feel free to use the array initializer or otherwise, but take time to make an array of your choosing and then test it out with a System.out.print of some kind to check an element within to satisfaction.
        //TODO Example: String[] myPets = new String[2]; myPets[0] = "Fluffy"; myPets[1] = "Spot"; OR: String[] myPets = {"Fluffy", "Spot"}. System.out.print(myPets[0]) // Fluffy

//        String[] myPets = new String[2];
//        myPets[0] = "Fluffy";
//        myPets[1] = "Spot";

//        String[] myPets = {"Fluffy", "Spot"};
//
//        System.out.println(myPets[0]);

        //~*~ Iterating Arrays ~*~
        //for + .length

        //TODO Together: A for loop [for(init;cond;count){}] can perform similar iteration tasks as we had used it for in JS.

        for (int i = 0; i < cohorts.length; i++){
            System.out.println("Codeup has a number of cohorts! One of them is the " + cohorts[i] + " cohort.");
        }

        //enhanced for (loop : loops){}
        //TODO Together: Java also provides an enhanced for [for (ele : arr) {}] to use!

        for (String cohort : cohorts){
            System.out.println("Codeup runs a few cohorts at a time - one of the ones from 2021 is " + cohort);
        }

        //TODO: Using the array you set up above, practice iterating through the array using both of our types of for loops. When might you choose to use one over the other?

        //~*~ Java array.methods() ~*~
        //We have access to a variety of pre-built static methods in the java.util.Arrays class

        //void Arrays.fill(arrayName, value) = let's fill all elements in the array provided with the given value.

        //TODO Together: An empty groceryList isn't going to work - let's at least get something in there. Everyone loves ice cream, right?

        for(String grocery : groceryList){
            System.out.println(grocery);
        }

        Arrays.fill(groceryList, "ice cream");

        //Yeah! Let's check out that methods work:
        for(String grocery : groceryList){
            System.out.println(grocery); //I scream, you scream, we all scream for ice cream!
        }

        //array Arrays.copyOf(myArray, arrLength) = let's make a clean copy of myArray up to arrLength element

        //TODO Together: Well, that was certainly a lot of ice cream. I think we overdid it though - maybe three pints of ice cream would suffice for a weekend ice cream party.

        String[] refinedList = Arrays.copyOf(groceryList, 3); //Cut me a copy of groceryList, but cutting off the rest of the list after 3 refinedList[length = 3]
        for(String grocery : refinedList){
            System.out.println("grocery from refinedList = " + grocery);
        }

        //Arrays.equals(arr1, arr2) = T/F: are both arrays the same type and all the elements equal?

        //TODO Together: Let's demonstrate equals by comparing our ice cream party lists:

        System.out.println("Arrays.equals(groceryList, groceryList) = " + Arrays.equals(groceryList, groceryList));
        System.out.println("Arrays.equals(refinedList, groceryList) = " + Arrays.equals(refinedList, groceryList));

        //~*~ More Array.methods() ~*~


    }

}
