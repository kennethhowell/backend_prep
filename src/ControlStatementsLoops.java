import java.util.Scanner;

public class ControlStatementsLoops {
    public static void main(String[] args) {

        //Boolean Expressions
        //An expression that evaluates to a boolean value (5 == 5 //t, 5 < 6 //t, 5 > 6 //f)
        //These relational operators will have similarities to our JavaScript work - however: no truth-y, or false-y (no === vs ==, <== vs <=, etc.)
        System.out.println("(5 == 5) = " + (5 == 5));
        System.out.println("(5 < 6) = " + (5 < 6));
        System.out.println("(5 > 6) = " + (5 > 6));

        System.out.println("('y' == 'Y') = " + ('y' == 'Y'));
        System.out.println("('y' == 'Y') = " + ('y' == 'y'));

//        boolean isAdmin = true;
//
//        System.out.println("(isAdmin == false) = " + (isAdmin == false));
//

        //Logical Operators
        //Combine multiple boolean values for evaluation - isAdmin & isLoggedIn, shoppingCart.length > 5 || isDiscountMember,
//    boolean isLoggedIn = true;
//    boolean isOwner = false;
//
//        System.out.println("(isAdmin && isLoggedIn) = " + (isAdmin && isLoggedIn) + ". Do I reveal the hidden administrator portal? " + (isAdmin && isLoggedIn)); //show an administrator panel
//        System.out.println("(isOwner || isAdmin) = " + (isOwner || isAdmin) + ". Is this the admin or the user who made this posqt? Do I show the edit panel to this post? " + (isOwner || isAdmin)); //show post edit tools if one is true
//        System.out.println("(!isLoggedIn) = " + (!isLoggedIn) + ", Am I not logged in and need to go to a log-in screen? " + (!isLoggedIn));
//

        //An interesting wrinkle: & vs && + | vs ||
        //Notice: What's up with X between & and &&? One operator still runs the right hand side (RHS) expression no matter what each time, the other will skip that step if the left hand side (LHS) is false

        int y = 2;
        int x = 3;

        if (false && (++x == y)) {
            System.out.println("x = " + x);
            System.out.println("Equal!");
        } else {
            System.out.println("x = " + x);
            System.out.println("Unequal.");
        }

        //String Comparison
        //Strings are not primitives! **danger**, str1 == str2 will not help us here!
        String str1 = "Kenneth";
        String str2 = "Kenneth";

        System.out.println("str1 == str2 = " + str1 == str2);

        //Try these methods instead:
        System.out.println("str1.equals(str2) = " + str1.equals(str2));

        String cohortLC = "marco";
        String cohortUC = "Marco";

        System.out.println("cohortLC.equals(cohortUC) = " + cohortLC.equals(cohortUC));
        System.out.println("cohortLC.equalsIgnoreCase(cohortUC) = " + cohortLC.equalsIgnoreCase(cohortUC));


        //~ - ~ * Control Structures * ~ - ~
        //Rely on our foundation in JS here - much of the logic will be similar in our head as to what is going on

        //If. .
        boolean isLoggedIn = false;
        boolean isOwner = true;
        boolean isAdmin = false;

//        if(isAdmin && isLoggedIn){
//            System.out.println("Admin portal accessed.");
//        }
//
//        if(isOwner || isAdmin){
//            System.out.println("Editing this content.");
//        }
//
//        if(isLoggedIn){
//            System.out.println("Welcome to our website!");
//        }
        //If.. else if/else:
//        if(isLoggedIn && isAdmin){
//            System.out.println("Show the 'admin' button to click on the home page and all recent posts by all users.");
//        } else if (isLoggedIn && isOwner){
//            System.out.println("Show the 'my account' button to click with this user's most recent posts.");
//        } else if (!isLoggedIn){
//            System.out.println("Please log in or register here!");
//        }

        //Switch case
        int diceRoll = (int) (Math.random() * 6 - 1 + 1) + 1;
        System.out.println("diceRoll = " + diceRoll);


        switch (diceRoll) {
            case 1:
                System.out.println("Rolled a one!");
                break;
            case 2:
                System.out.println("Rolled a two!");
                break;
            case 3:
                System.out.println("Rolled a three!");
                break;
            case 4:
                System.out.println("Rolled a four!");
                break;
            case 5:
                System.out.println("Rolled a five!");
                break;
            case 6:
                System.out.println("Rolled a six!");
                break;

        }


        //While
//        int i = 0;
//        while (i <= 10) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        boolean newsletterSignUp = true;
//        Scanner scanner = new Scanner(System.in);
//
//        while (newsletterSignUp) {
//
//
//            System.out.println("Are you ready to sign up for our newsletter? Note: Only 'yes' will work. :)");
//            String userInput = scanner.nextLine();
//            if (userInput.equalsIgnoreCase("yes")) {
//                System.out.println("We are so happy to hear you are interested in our newsletter! Thank you for signing up.");
//                newsletterSignUp = false;
//            } else {
//                System.out.println("I'm sorry. . that's an unacceptable answer.");
//            }
//        }


        //Do-while
//        Scanner scanner = new Scanner(System.in);
//        boolean newsletterSignUp;
//        do {
//            System.out.println("Are you ready to sign up for our newsletter? Note: Only 'yes' will work. :)\n");
//            String userInput = scanner.nextLine();
//            if (userInput.equalsIgnoreCase("yes")) {
//                System.out.println("We are so happy to hear you are interested in our newsletter! Thank you for signing up.");
//                newsletterSignUp = false;
//            } else {
//                System.out.println("I'm sorry. . that's an unacceptable answer.");
//                newsletterSignUp = true;
//            }
//        } while (newsletterSignUp);

        //For
        for(int i = 0; i < 10; i += 1) {
            System.out.println("i is " + i);
        }

        String[] fruits = {"apples", "bananas", "jackfruit"}; //Don't worry about the structure of this - we cover arrays in JII :)
        //The point of setting up an array here is to show how similar some of our logic from JS might be in the world of Java - for example, run down the length of an arr and print me the element there.

        for(int i = 0; i < fruits.length; i++){
            System.out.println("Here's a fruit: " + fruits[i]);
        }

        //Break and continue
        // print the numbers 1 through 5

        for(int i = 1; i < 100; i++) {
            System.out.println(i);
            if (i == 5) {
                break; // --------------+
            } //                        |
        } //                            |
// <----------------------------+

        for(int i = 1; i <= 10; i++) { // <--+
            if(i % 2 == 1) { //              ^
                System.out.println("Woops - skipping odd number");
                continue; // ----------------^
            }
            System.out.println("Heres a nice even number " + i);
        }


    }

}