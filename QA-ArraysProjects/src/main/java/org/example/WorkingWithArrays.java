package org.example;

import java.util.Scanner;

public class WorkingWithArrays {

    //Challenge:

    //Prompt the user to input 5 integers;
    //Store each of the integers in a regular, built-in array;
    //After the storing is completed, in a separate loop, print each of the values in the array multiplied by 2.

    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        int[] arrayOfValues = new int[5];

        for(int i = 0; i < arrayOfValues.length; i++) {
            System.out.print("Enter an integer\t");
            arrayOfValues[i] = keyboard.nextInt();
        }//end for

        for (int value : arrayOfValues) {
            int result = value * 2;
            System.out.println("Result is " + result);
        }//end for


    }//end of main


}//end of WorkingWithArrays
