import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Menu {

Gameboard gameboard = new Gameboard();
Scanner input = new Scanner(System.in);

private static String player1 = "Player 1";
private static String player2 = "Player 2";



    public void mainMenu(){


        //load data into hashmap (gameboard)
        Gameboard.hashmap();


        startInstructions();



        boolean activeMenu = true;

        while (activeMenu){

            System.out.println(gameboard.displayBoard());
            boolean player2True = true;
            boolean player1True = true;

            //player 1s turn

            while (player1True) {

                System.out.printf("\n%s, enter your choice: ", player1);
                String playerSymbol = "X";

                String select = input.next();


                if (!Gameboard.getGameMap().containsKey(select)) {
                    System.out.printf("%s is not a valid choice, try again.", select);

                }
                else {
                    System.out.println("You selected " + select);

                    System.out.println(gameboard.editBoard(select, playerSymbol));
                    player1True = false;
                    player2True = true;
                }

            }


            //player 2

            while (player2True) {

                System.out.printf("\n%s, enter your choice: ", player2);
                String playerSymbol = "O";


                String select = input.next();



                if (!Gameboard.getGameMap().containsKey(select)) {
                    System.out.printf("%s is not a valid choice, try again.", select);
                }
                else {
                    System.out.println("You selected " + select);

                    System.out.println(gameboard.editBoard(select, playerSymbol));
                    player2True = false;
                    player1True = true;
                }
            }




        }
    }




    public void startInstructions() {
        System.out.println("Welcome to this Tic-Tac-Toe game!\n\n" +
                "Please type the field you select (i.e. c3 for the bottom right corner.\n" +
                "\nPlayer 1 goes first, then player 2.\n");

    }

}
