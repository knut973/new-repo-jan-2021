package no.dnb.classesRetailer;

public class Game {


    private String title;
    private double grossPrice;
    private int amountInStock;

    public Game (String title, double grossPrice, int amountInStock) {
        this.title = title;
        this.grossPrice = grossPrice;
        this.amountInStock = amountInStock;

    }
    
    // ANDY: Can simplify: return amountInStock > 0;
    public boolean isInStock(){
        if (amountInStock > 0)
            return true;
        else
            return false;
    }

    public String returnInventory(){
        return ("" + title + ": " + amountInStock + " in stock.");
    }


}
