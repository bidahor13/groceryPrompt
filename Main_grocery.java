package com.Babatunde;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by Babatunde on 9/13/2016.
 */
public class Main_grocery {
    private static Scanner scan = new Scanner(System.in);
    private static GroceryList groceryList= new GroceryList();


     public static void main(String[] args){
         boolean quit = false;
         int choice = 0;
         printInstruction();
         while(!quit){
             System.out.println("Enter you choice: ");
             choice = scan.nextInt();
             scan.nextLine();

             switch(choice){
                 case 0:
                     printInstruction();
                     break;
                 case 1:
                     groceryList.printGroceryList();
                     break;
                 case 2:
                     addItem();
                     break;
                 case 3:
                     modifyItem();
                     break;
                 case 4:
                     removeItem();
                     break;
                 case 5:
                     searchItem();
                     break;
                 case 6:
                     quit = true;
                     break;

             }
         }
     }
     public static void printInstruction(){
         System.out.println("\nPress: ");
         System.out.println("\t 0 - To print choice options. ");
         System.out.println("\t 1 - To print the list of grocery items. ");
         System.out.println("\t 2 - To add an item to the list. ");
         System.out.println("\t 3 - To modify the item in the list. ");
         System.out.println("\t 4 - To remove an item from the list ");
         System.out.println("\t 5 - To search for an item in the list. ");
         System.out.println("\t 6 - To quit the application. ");
     }

     public static void addItem(){
         System.out.println("Enter grocery item: ");
         groceryList.addGroceryList(scan.nextLine()); // nextLine moves
    }




    public static void modifyItem(){
        System.out.println("Enter item number: ");
        int itemNo = scan.nextInt(); //accepts the next input value from the user
        scan.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scan.nextLine();
        groceryList.modifyGroceryList(itemNo-1,  newItem);
    }

    public static void removeItem(){
        System.out.println("Enter the item number: ");
        int itemNo = scan.nextInt();
        scan.nextLine();
        groceryList.removeGroceryItem(itemNo-1);
    }


    public static void searchItem(){
        System.out.println("Enter the item to search for: ");
        String searchItem = scan.nextLine().toLowerCase();
        if(groceryList.findItem(searchItem) != null){
            System.out.println("Found " + searchItem + " in the grocery list");
        } else{
            System.out.println(searchItem +" not found in the shopping list");
        }

    }

}
