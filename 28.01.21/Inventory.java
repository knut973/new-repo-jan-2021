package no.dnb.classesRetailer;


import java.util.ArrayList;

public class Inventory {

    // ANDY: These don't belong in Inventory, they belong in Product. A product has a title, price, unitsInStock; an inventory doesn't.
    private static int VAT = 25;
    private String title;
    private double netPrice;
    private int unitsInStock;

    // ANDY: Should use generics:
    // private static ArrayList<Product> listTitle = new ArrayList<Product>();
    // Also don;t have a list of titles and a list of prices - instead have a list of products.
    private static ArrayList listTitle = new ArrayList();
    private static ArrayList listStock = new ArrayList();


    public Inventory (String title, double grossPrice, int unitsInStock){

        this.title = title;
        this.netPrice = (grossPrice / (1 + VAT));
        this.unitsInStock = unitsInStock;

        this.listTitle.add (title);
        this.listStock.add (unitsInStock);




        //System.out.println(arrlist.get(0));

    }

    // ANDY: This should be in the Product class. It's a product that has a price, not an inventory.
    public double netPrice(){
        return netPrice;
    }

    // ANDY: The next 2 methods should actually just be a single method, to get a product.
    public String listTitles(int x){

        return (String) listTitle.get(x);
    }
    public int arraySizeTitles(){

        return listTitle.size();
    }

    public int listStock(int x){

        return (int) listStock.get(x);
    }
    public int arraySizeStock(){

        return listStock.size();
    }










}
