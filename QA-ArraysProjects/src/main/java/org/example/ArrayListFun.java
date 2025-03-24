package org.example;

import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>(); //no need to specify a size here, unlike with Arrays
                        //ArrayLists only hold reference types, not primitives - they store the addresses of all the data they maintain
        namesList.add("John");
        namesList.add("Kyle");
        namesList.add("Matthew");
        namesList.add("Amanda");
        namesList.add("Wendy"); //using add() method to add names to arrayList

        for(int i = 0; i < namesList.size(); i++) { //using size() instead of length-for regular arrays
            System.out.println(namesList.get(i)); //using get() to retrieve the values
        }//end of for loop

    }//end of main

}//end of ArrayListFun
