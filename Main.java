package com.Babatunde;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*the getInteger takes the input of 5 values and assigns to the array.*/
        double[] myInteger = getIntegerValues(5);
        for(int i =0; i< myInteger.length; i++){
            System.out.println("Element " + i +", typed value was " + myInteger[i] );
        }

        System.out.println("Average sum of the values in the array " + getAverage(myInteger));
    }

    public static double[] getIntegerValues(int number){
        System.out.println("Enter "+ number + " integer value.\r");
       double[] values = new double[number];
        /* loops through and takes the scanner input value and stores it in the array called value[i]*/
            for(int i =0; i<values.length; i++){
                values[i] = scanner.nextDouble();
        }
        return values;
    }

    /**
     * Calculates the avarge of the sum and average of the numbers in the array.
     *
     * @param array Take the total value of the array
     * @return  Get the average of the numbers in the arr
     */
    public static double getAverage(double[] array){
        double sum =0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return sum/(double)array.length;
    }


}
