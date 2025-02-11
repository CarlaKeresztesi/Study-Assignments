package collectionsexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(); //created new list of integers

        //fill the list with numbers from 0 to 100
        for (int i = 0; i <= 100; i++) {
            nums.add(i);
        }

        System.out.println(nums);

        //ListIterator - extends Iterator interface
        ListIterator<Integer> numsListIterator = nums.listIterator(); //creating an object from the ListIterator

        while(numsListIterator.hasNext()) {

            int indexNum = numsListIterator.nextIndex(); //print the index no. of the elements w .nextIndex() of the
            System.out.print(indexNum + " ");            // ListIterator and assign it to a new var indexNum

            int num = numsListIterator.next(); //ass each elem of the list to a new var w the .next() method
                        //so in each loop the next elem will be passed to a new var called num

            if(num % 4 != 0) {
               numsListIterator.set(1); //the numbers not div by 4, convert them to 1
            }

        }

        //Iterator

       /* //we will remove numbers that are not a multiple of 4, that is numbers that are not divis by 4 from the nums list
        //we will get numbers that are divisible by 4

        Iterator<Integer> numsIterator = nums.iterator(); //creating iterator object

        while(numsIterator.hasNext()) {//hasNext() method returns true if there's another token available in the scanner
             int num = numsIterator.next(); //assigning each elem of the list to a new var w the .next() method

             if(num % 4 != 0) { //remove the numbers that are not divisible by 4
                numsIterator.remove(); //with the .remove()
            }
        }*/

        System.out.println(); //to move the cursor to the next line after printing with print method - the indexes above

        System.out.println(nums);

    }//end of main



}
