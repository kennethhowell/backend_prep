public class exercise {

    public static void main(String[] args) {
         String myName = "Ken";
         String yourName = "Kelvon";
         String Kelvon = "Kelvon";

        System.out.println("yourName.equalsIgnoreCase(myName) = " + yourName.equalsIgnoreCase(myName));
        System.out.println("yourName.equals(kelvon) = " + yourName.equals(Kelvon));

        System.out.println("kelvon == yourName = " + Kelvon == yourName);

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

        // print the numbers 1 through 5

//        for(int i = 1; i < 100; i++) {
//            System.out.println(i);
//            if (i == 55) {
//                break; // --------------+
//            } //                        |
//        } //                            |
//// <----------------------------+

        for(int i = 1; i <= 10; i++) { // <--+
            if(i % 2 == 1) { //              |
                System.out.println("Woops - this is an odd number!");
                continue; // ----------------+
            }
            System.out.println(i);
        }

    }
}
