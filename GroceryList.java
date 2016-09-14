package com.Babatunde;

import java.util.ArrayList;

/**
 * Created by Babatunde on 9/13/2016.
 */
public class GroceryList {
    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();


    /**
     * This method adds items to the grocery list.
     *
     * @param item  Takes a value of the item to be added to the grocery list
     */
    public void addGroceryList(String item){
        groceryList.add(item);
    }

    /**
     * Getter method used with the processArray Method in Main_grocery.java class
     *
     * @return the list of item in the grocery list.
     */
   public ArrayList<String> getGroceryList(){
       return groceryList;
   }

    /**
     * This method prints all the items on the grocery list.
     */
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in the grocery list");
        for (int i=0; i<groceryList.size(); i++){
            System.out.println((i+1)+ ". " + groceryList.get(i));
        }
    }

     /* overloading the modifyGroceryList parameters*/
    public void modifyGroceryList(String currentItem, String newItem){
                int position = findItem(currentItem);
                if(position >= 0){
                  modifyGroceryList(position, newItem);
                }
    }

    /**
     * This private method modifies the position of the item on the list based.
     *
     * @param pos  Is the postion of an item on the grocery list.
     * @param item  takes a formal value of the item.
     */
    private void modifyGroceryList(int pos, String item){
        String theItem = groceryList.get(pos);
        groceryList.set(pos, item);
        System.out.println("Grocery item " + (pos + 1) + " has been modified");
    }


    /**
     * This private method removes an item from the grocery list.
     *
     * @param pos  Represents the position of the item to
     *             be removed from the grocery list.
     */
    private void removeGroceryItem(int pos){
        //String theItem = groceryList.get(pos);
        groceryList.remove(pos);
    }

     /* overloading the removeGroceryList parameters*/
     public void removeGroceryItem(String item){
         int position = findItem(item);
         if(position >= 0){
             removeGroceryItem(position);
         }
     }


    /**
     * Method is used to find an items on the list
     *
     * @param searchItem  takes a value of a search item and adds it the list.
     * @return the index value of the item on the list as a number.
     */
    private int findItem(String searchItem){
         return groceryList.indexOf(searchItem);
         /** boolean exists = groceryList.contains(searchItem);
         //return searchItem;
        //return  int pos = groceryList.indexOf(searchItem);
         //if(pos >= 0){
             //return groceryList.get(pos);
         //}
         return null;
     }  **/

   }

    /**
     * Method is used to check if an item is on the grocery list.
     *
     * @param searchItem   The item that is being searched
     * @return  True if the item exist in the groceryList.
     */

   public boolean onFile(String searchItem){
       int position = findItem(searchItem);
       if(position >=0){
           return true;
       }
       return true;
   }
}
