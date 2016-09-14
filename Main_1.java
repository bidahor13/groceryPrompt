package com.Babatunde;

/**
 * Created by Babatunde on 9/13/2016.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main_1 {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int[] numbers= getIntegers(5);
        int[] sorted = sortIntegers(numbers);
        System.out.println("-----------Here are the elements in the array all sorted------");
        printArray(sorted);
    }

    /**
     *  This method return all the array of entered integers from the keyboard
     *
     * @return  the elements of the entered integers.
     */
    public static int[] getIntegers(int number){
        System.out.println("Enter  " + number + " integer values to be sorted  .\r" );
        int[] enteredIntegers = new int[number];
        for(int i=0; i < enteredIntegers.length; i++){
            enteredIntegers[i] = scan.nextInt();
        }
        return enteredIntegers;
    }


    /**
     * This method prints out all the elements in the array.
     */
    public static void  printArray(int[] print){
        for(int i=0; i< print.length; i++){
            System.out.print(print[i]+ " , ");
        }
    }


    /**
     * This method sorts the array
     *
     * @param arrayValues takes the value of the array and sorts .
     * @return The sorted array
     */
    public static int[] sortIntegers(int[] arrayValues){

        //int[] sortedArray = Arrays.copyOf(arrayValues, arrayValues.length);  second option of copying an array to another array.

        // sorting array
        int[] sortedArray = new int[arrayValues.length];
        for(int i =0; i< arrayValues.length; i++) {
            sortedArray[i] = arrayValues[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0; i < sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }

            }

       }

        return sortedArray;
    }


}
