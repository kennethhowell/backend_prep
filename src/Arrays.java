public class Arrays {

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

        //TODO: Build your first Java array! Feel free to use the array initializer or otherwise, but take time to make an array of your choosing and then test it out with a System.out.print of some kind to check an element within. Ex: String[] myPets = new String[2]; myPets[0] = "Fluffy"; myPets[1] = "Spot"; OR: String[] myPets = {"Fluffy", "Spot"}. System.out.print(myPets[0]) // Fluffy

//        String[] myPets = new String[2];
//        myPets[0] = "Fluffy";
//        myPets[1] = "Spot";

        String[] myPets = {"Fluffy", "Spot"};

        System.out.println(myPets[0]);

    }

}
