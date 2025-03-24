package org.example;

import java.util.ArrayList;

public class ArrayListChallenge { // Create enhanced for loop to print out the names

    public static void main(String[] args) {

        ArrayList<String> namesList = new ArrayList<>();

        namesList.add("John");
        namesList.add("Kyle");
        namesList.add("Matthew");
        namesList.add("Amanda");
        namesList.add("Wendy");

        for(String name : namesList) { //for(type we use - here String, then individual name : name of array)
            System.out.println(name);
        }//end of for loop
    }//end of main
}//end of ArrayListChallenge
