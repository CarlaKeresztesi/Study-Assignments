package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkingWithArrayLists {
    public static void main (String[] args) {

        //Challenge:

        //Create an ArrayList and populate it with non-negative numbers (real numbers 0 or greater);
        //The user will enter the real numbers from the console;
            //-stop asking for numbers when the user enters a negative number;
            //-when the user prompting loop is finished, you should print the values in the ArrayList in reverse order;
            //-consider doing a priming read before your loop.
        //Hints:
        //Remember that ArrayLists hold only reference types but Wrapper Classes can help;
        //The Scanner has a method to help reading in double data (e.g. nextInt());
        //How might you print the values in order? ArrayList.size() returns the size of the ArrayList...

        Scanner keyboard = new Scanner(System.in);
        ArrayList<Double> myList = new ArrayList<>();

        double input;

        System.out.println("Enter number > 0 to put in the list " + "or -1 to exit");

        input = keyboard.nextDouble();

        while(input >= 0) {
            myList.add(input);
            System.out.println("Enter number > 0 to put in the list " + "or -1 to exit");
            input = keyboard.nextDouble();
        }//end while loop

        for(int i = myList.size() - 1; i >= 0; i--) {
            System.out.println(myList.get(i));
        }//end of for



    }//end of main



}//end of WorkingWithArrayLists
