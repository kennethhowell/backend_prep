package ExceptionsAndErrorHandling;

public class ExceptionsAndErrorHandling {


    public static void main(String[] args) {
        //**slide 3**

        //Exceptions: A tool for handling errors
        //Exceptions are objects created from one of several Classes.
        //Exceptions may be thrown!

        try{
            throw new Exception("Something went wrong!\nError, error!\nError, error!");
            //System.out.println("Everything is not okay!"); //Error: Unreachable code!
        } catch(NullPointerException e){
            //A NullPointerException happened!
            e.printStackTrace();
        } catch (RuntimeException e){
            //A runtime exception happened!
            e.printStackTrace();
        } catch (Exception e) {
            //A general exception happened!
            e.printStackTrace();
        }

        //Let's see another example:


        //Try-Catch: Exceptions can be caught / handled instead of crashing the application!

//        int result = 1 / 0;

//        try {
//            System.out.println("Let's see . . .");
//            int result = 1 / 0;
//            System.out.println("I can divide by zero! See: " + result);
//        } catch (ArithmeticException e){
//            //Slide deck example is a little silly: We would usually want to have a more descriptive error message for our user to see
//            System.out.println("Error: User attempted to divide by zero.");
//            e.printStackTrace();
//
//        }

//
//        try{
//            String[] days = {"Monday", "Tuesday"};
//            System.out.println(days[4]);
////ArrayIndexOutOfBoundsException
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("\nThere is an error! User attempted to print out an array element outside of the array's length!\n");
//            e.printStackTrace(System.out);
////General Exception
//        } catch (Exception e){
//            System.out.println("General Exception");
//            e.printStackTrace();
//        }



    }


}
