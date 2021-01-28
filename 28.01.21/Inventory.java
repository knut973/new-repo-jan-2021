package no.dnb.classesRetailer;


import java.util.ArrayList;

public class Inventory {

    private static int VAT = 25;

    private String title;
    private double netPrice;
    private int unitsInStock;


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

    public double netPrice(){
        return netPrice;
    }

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
