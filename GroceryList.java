package com.Babatunde;

import java.util.ArrayList;

/**
 * Created by Babatunde on 9/13/2016.
 */
public class GroceryList {
    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();


    public void addGroceryList(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in the grocery list");
        for (int i=0; i<groceryList.size(); i++){
            System.out.println((i+1)+ ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryList(int pos, String item){
        String theItem = groceryList.get(pos);
        groceryList.remove(pos);
    }

    public void removeGroceryItem(int pos){
        String theItem = groceryList.get(pos);
        groceryList.remove(pos);

    }

     public String findItem(String searchItem){
         //boolean exists = groceryList.contains(searchItem);
         //return searchItem;

         int pos = groceryList.indexOf(searchItem);
         if(pos >= 0){
             return groceryList.get(pos);
         }
         return null;
     }



}
