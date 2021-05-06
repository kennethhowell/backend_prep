package OOPactivity;

import java.util.Scanner;

public class Chess {
    //What is going to go into this blueprint?

    //chess numPlayers
    //chess string representation 8x8
    //chess chessPiece objects [] <<< workshop 2
        //chessPiece object method move()
    //chess 2darray/matrix represents physical board << workshop 2

    //chess method settingUpPieces()
    //chess method chooseSide()
    //chess method playChess() > > ^

    final int numPlayers = 2;
    String chessBoard = "8x8";
    //chessPiece[] chessPieces = new chessPiece[]; < Java II / Java III workshop
    String[] chessPieces = {"Pawn", "Rook", "Knight", "Bishop", "King", "Queen"};

    public void settingUpPieces() {
        //Instructions here of where to place the above pieces into a 2darray? What if our method used the 2d array idea to construction something like this:
        // * rook | bishop | knight | queen | knight | knight | bishop | rook *

        System.out.println("Get the pieces out of the box");
        System.out.println("Getting the board prepared on the table");
        System.out.println("Place the pieces on the board");
        System.out.println("Ready to play");

    };

    public String chooseSide() {
        //Instructions to return a random side or a side selection program
        System.out.println("Which side would you like to play as? [black or white]");
        //Validation of user input
        //Stick them into a loop if they did not type in black or white
        //All of the above can be done
        Scanner sc = new Scanner(System.in);

        String sideSelect = sc.nextLine();

        return sideSelect;
    };

    public boolean playChess(){
        //instructions to run a game of chess.. a big one!
        //pieces, specific moves > did we do chessPiece objects and do we need ot consider their specific move()
        //For now: excellent idea from Roland, let's return a bool after asking t/f if user wants to play
        System.out.println("Are you ready to play a game of chess? [y/n]");
        Scanner sc = new Scanner(System.in);
        String readyToPlay = sc.nextLine();

        if(readyToPlay.equalsIgnoreCase("y")){
            return true;
        } else {
            return false;
        }

    };



    //Future goals: Marco chess team by this weekend!

    public static void main(String[] args) {

        //Kenny goes down to Target and buys a new game of Chess!
        Chess kennysChess = new Chess();

        System.out.println("Got home with my new chess board");
        System.out.println("Let's make sure that everything looks okay with it");

        System.out.println("kennysChess.chessBoard = " + kennysChess.chessBoard);
        System.out.println("kennysChess.numPlayers = " + kennysChess.numPlayers);

        for(String piece : kennysChess.chessPieces){
            System.out.println(piece);
        }







    }







}
