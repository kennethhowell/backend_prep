public class ControlStatementsLoops {
    public static void main (String[] args){

    //Boolean Expressions
    //An expression that evaluates to a boolean value (5 == 5 //t, 5 < 6 //t, 5 > 6 //f)
    //These relational operators will have similarities to our JavaScript work - however: no truth-y, or false-y (no === vs ==, <== vs <=, etc.)
        System.out.println("(5 == 5) = " + (5 == 5));
        System.out.println("(5 < 6) = " + (5 < 6));
        System.out.println("(5 > 6) = " + (5 > 6));

        System.out.println("('y' == 'Y') = " + ('y' == 'Y'));
        System.out.println("('y' == 'Y') = " + ('y' == 'y'));

        boolean isAdmin = true;

        System.out.println("(isAdmin == false) = " + (isAdmin == false));


    //Logical Operators
    //Combine multiple boolean values for evaluation - isAdmin & isLoggedIn, shoppingCart.length > 5 || isDiscountMember,
    boolean isLoggedIn = true;
    boolean isOwner = false;

        System.out.println("(isAdmin && isLoggedIn) = " + (isAdmin && isLoggedIn) + ". Do I reveal the hidden administrator portal? " + (isAdmin && isLoggedIn)); //show an administrator panel
        System.out.println("(isOwner || isAdmin) = " + (isOwner || isAdmin) + ". Is this the admin or the user who made this post? Do I show the edit panel to this post? " + (isOwner || isAdmin)); //show post edit tools if one is true
        System.out.println("(!isLoggedIn) = " + (!isLoggedIn) + ", Am I not logged in and need to go to a log-in screen? " + (!isLoggedIn));


        //An interesting wrinkle: & vs && + | vs ||
    //Notice: What's up with X between & and &&? One operator still runs the right hand side (RHS) expression no matter what each time, the other will skip that step if the left hand side (LHS) is false

        int y = 2;
        int x = 3;

        if (false && (++x == y)){
            System.out.println("x = " + x);
            System.out.println("Equal!");
        } else {
            System.out.println("x = " + x);
            System.out.println("Unequal.");
        }

        //String Comparison
    //~ - ~ * Control Structures * ~ - ~
    //If. .
    //Switch case
    //While
    //Do
    //For
    //Break and continue

    }
}
