package no.dnb.classesRetailer;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    private static final DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {




    Game tower = new Game("Fantasia", 200, 20);
    Inventory towerInv = new Inventory("Fantasia", 200, 20);

    Game monopoly = new Game("Monopoly", 150, 15 );
    Inventory monopolyInv = new Inventory("Monopoly", 150, 15);




    int arraySizeTitles = towerInv.arraySizeTitles();
    int arraySizeStock = towerInv.arraySizeStock();





            //menu

    boolean menu = true;
    boolean invMenu = true;
    Scanner input = new Scanner(System.in);


    while (menu){

        System.out.println(" Press \"1\" to open inventory. \n Press \"2\" to exit.");
        int selection = input.nextInt();

        if (selection == 1){
            invMenu = true;

            while (invMenu){

            System.out.println(
                    "\nEnter \"1\" to add a new game to the inventory. \n" +
                    "Enter \"2\" to see current stock. \n" +
                    "Enter \"3\" to exit to main menu.");
            int option = input.nextInt();


            //add new product
            if (option == 1){

                System.out.println("Enter product name: ");
                    String gameX = input.next();

                System.out.printf("\nEnter the gross price for %s: ", gameX);
                    int gameXPrice = input.nextInt();

                System.out.printf("\nEnter the quantity of %s to store: ", gameX);
                    int gameXQuantity = input.nextInt();

                Game gameX1 = new Game(gameX, gameXPrice, gameXQuantity);
                Inventory gameX2 = new Inventory(gameX, gameXPrice, gameXQuantity);


                arraySizeTitles = towerInv.arraySizeTitles();
                arraySizeStock = towerInv.arraySizeStock();
                System.out.println(arraySizeTitles);
                System.out.println(arraySizeStock);

                break;





            //current listsinventory

            }
            if (option == 2){

//                String checkInventory1 = tower.returnInventory();
//                System.out.println(checkInventory1);
//                String checkInventory2 = monopoly.returnInventory();
//                System.out.println(checkInventory2);



                System.out.println("Listing inventory: ");
                for (int i = 0; i < arraySizeTitles;i++)
                {
                    System.out.println(towerInv.listTitles(i));
                }

                System.out.println("\nListing stock: ");
                for (int i = 0; i < arraySizeStock;i++)
                {
                    System.out.println(towerInv.listStock(i));
                }


            }

            if (option == 3)
                invMenu = false;
            }




        }
        if (selection ==2){
            menu = false;

        }


        }








    // is a single game in stock? true/false
    boolean isGameInStock = tower.isInStock();
        System.out.println("Is the game in stock? " + isGameInStock);




    // return netprice

    double netPrice = towerInv.netPrice();
        System.out.println("Net price is " +df2.format(netPrice));



    }

}
