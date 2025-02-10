package collectionsexample;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {

        //Sorting an Integer ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(6);
        numbers.add(4);
        numbers.add(11);
        numbers.add(32);
        numbers.add(2);
        numbers.add(50);

        Collections.sort(numbers);

        System.out.println(numbers);

        //Sorting a char list
        ArrayList<Character> myChars = new ArrayList<>();

        myChars.add('a');
        myChars.add('B');
        myChars.add('A');
        myChars.add('F');
        myChars.add('b');
        myChars.add('E');

        Collections.sort(myChars);

        System.out.println(myChars);

        //Sorting a String list
        ArrayList<String> myCars = new ArrayList<>();

        myCars.add("Ferrari");
        myCars.add("Opel");
        myCars.add("Mercedes");
        myCars.add("BMW");
        myCars.add("Ford");
        myCars.add("hyundai"); //lowercase is always greater than uppercase in sorting - so will appear later

        Collections.sort(myCars);

        System.out.println(myCars);

        //Another example of sorting strings
        ArrayList<String> myNums = new ArrayList<>();

        myNums.add("50");
        myNums.add("70");
        myNums.add("5");
        myNums.add("90");
        myNums.add("9");
        myNums.add("60");
        myNums.add("a");
        myNums.add("Z");

        Collections.sort(myNums);

        System.out.println(myNums); // [5, 50, 60, 70, 9, 90] THEN, AFTER ADDING ELEM [5, 50, 60, 70, 9, 90, Z, a]











    }//end of main







}
