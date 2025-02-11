package collectionsexample;

import java.util.ArrayList;
import java.util.Collections;

public class SearchingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> age = new ArrayList<>();

        //adding elements to the unsorted list
        age.add(16);
        age.add(8);
        age.add(14);
        age.add(12);
        age.add(36);
        age.add(24);
        age.add(19);

        //now we add this method to sort list so the result is predictable
        Collections.sort(age);// sorted list looks like this: 8 12 14 16 19 24 36 --> result of println is 2

        //parameters in Collections.binarySearch(list name (here is age), (element whose index no. we want to know, ie 14))
       // Collections.binarySearch(age, 14); --> we cut this and call it in the println method

        //searching in unsorted list
        System.out.println(Collections.binarySearch(age, 14));// output is -5 --> unpredictable

        //searching in sorted list
        System.out.println(Collections.binarySearch(age, 24));// --> output is 5

        //searching for element that is not in the list
        System.out.println(Collections.binarySearch(age, 5));// --> -1

    }//end of main





}
