import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        talkToBob();
    }

    public static void talkToBob(){
        boolean keepTalking;
        Scanner sc = new Scanner(System.in);
        System.out.println("Arriving without much aplomb, Bob steps into the room to talk to you with his head down.");
        System.out.println("Keeping his head down, Bob steps past you and slinks down into a sitting position nearby.");
        System.out.println("He takes an airpod out of his ear that you had missed and looks up at you boredly.");
        do{
            System.out.println("What would you like to say to Bob?");
            String userInput = sc.nextLine();

            if(userInput.endsWith("?")){
                System.out.println("Bob looks at his feet, to the wall, and then finally to your eyes.\n'Sure,' he says.");
            } else if (userInput.endsWith("!")){
                System.out.println("His eyes pop open in shock from what you said.\nHe raises his arms up saying 'Whoa!! Chill out!'");
            } else if (userInput.length() == 0){
                System.out.println("Bob rolls his eyes.\n'Fine. Be that way,' he says and crosses his arms.");
            } else {
                System.out.println("Without adjusting himself, Bob mutters 'whatever'");
            }

            System.out.println("Would you like to talk to Bob some more? [yes] [no]");
            String userContinue = sc.nextLine();

            if(userContinue.equalsIgnoreCase("yes")){
                keepTalking = true;
            } else {
                keepTalking = false;
            }

        } while (keepTalking);

        System.out.println("'Thank god that's over with,' Bob says as he gathers himself up from where he was sitting.\nHe gives you a weak wave and exits the room." );

    }
}
