import java.util.HashMap;



public class Gameboard {


    private static  HashMap<String, String> gameMap = new HashMap<>();


    public static HashMap<String, String> getGameMap() {
        return gameMap;
    }


    //method to populate hashmap (gameboard)
    public static void hashmap(){

        gameMap.put("a1", "_");
        gameMap.put("a2", "_");
        gameMap.put("a3", "_");
        gameMap.put("b1", "_");
        gameMap.put("b2", "_");
        gameMap.put("b3", "_");
        gameMap.put("c1", "_");
        gameMap.put("c2", "_");
        gameMap.put("c3", "_");


    }



    //displays current gameboard, including updates from editBoard
    public static String displayBoard(){

        String board = String.format("\n  A B C \n1 %s %s %s \n2 %s %s %s \n3 %s %s %s"
                , gameMap.get("a1"), gameMap.get("a2"), gameMap.get("a3"),
                gameMap.get("b1"), gameMap.get("b2"), gameMap.get("b3"),
                gameMap.get("c1"), gameMap.get("c2"), gameMap.get("c3"));


//        checkForVicotry();
//
//            if (checkForVicotry(true)){
//                return "Victory!";
//            }

//        if (gameMap.get("a1").equals(gameMap.get("a2").equals(gameMap.get("a3")))){
//            if (gameMap.get("a1") = gameMap.get("a3") = gameMap.get("a3")){
//            return ("victory!");


//        }
//        else
            return board;

    }

    //edits the gameboard
    public String editBoard(String select, String playerSymbol){
        gameMap.replace(select, playerSymbol);
        return displayBoard();




    }

//    public static boolean checkForVicotry(){
//        if (gameMap.get("a1").equals(gameMap.get("a2").equals(gameMap.get("a3")))){
//            return true;
//
//
//    }





}


