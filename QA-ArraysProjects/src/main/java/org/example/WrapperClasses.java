package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WrapperClasses {
    public static void main (String[] args) {
        ArrayList<Integer> myAL = new ArrayList<>();

        myAL.add(10); //Autoboxing
        myAL.add(new Integer(22)); //no autoboxing

        for(int i = 0; i < myAL.size(); i++) {
          //  int num = myAL.get(i); //no need for this as it does auto-unboxing
            System.out.println(myAL.get(i));// auto - unboxing = no need to convert type when using get() - it will return the primitive
        }//end for

        String someValue = "460";
        int numericValue = Integer.parseInt(someValue);

        System.out.println(numericValue); // - we can convert the string to numeric values
    }//end of main
}//end of WrapperClasses

//Wrapper classes are reference types - create them using the new keyword
//Autoboxing = java places the primitives we want to store inside the object - the primitive is automatically put
                // into our box object in the corresponding wrapper class - no need for keyword