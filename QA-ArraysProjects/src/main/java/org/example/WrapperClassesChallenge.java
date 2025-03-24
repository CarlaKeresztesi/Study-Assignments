package org.example;

import java.util.ArrayList;

public class WrapperClassesChallenge {
    public static void main (String[] args) {
        ArrayList<Integer> myAL = new ArrayList<>();

        myAL.add(10);
        myAL.add(22);

        for(int i = 0; i < myAL.size(); i++) {
            System.out.println(myAL.get(i));
        }//end for

        String someValue = "460";
        int numericValue = Integer.parseInt(someValue);

        System.out.println(numericValue);

        //Create a string holding "3.14159" and use the appropriate wrapper class to convert the string to a double.

        String pi = "3.14159";

        double numVal = Double.parseDouble(pi);

        numVal += 2.5; //we can add to it

        System.out.println(numVal);

    }//end of main

}//end of WrapperClassesChallenge

