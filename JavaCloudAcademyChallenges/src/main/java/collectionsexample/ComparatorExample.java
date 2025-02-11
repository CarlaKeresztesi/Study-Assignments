package collectionsexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {

        List<Integer> numsList = new ArrayList<>();

        numsList.add(10);
        numsList.add(5);
        numsList.add(13);
        numsList.add(7);
        numsList.add(20);
        numsList.add(2);

        // the 1st parameter of this method is a list - numsList.
        // The 2nd parameter is the comparator - we create the class MyNumbers to update it in the parentheses
        Collections.sort(numsList, new MyNumbers()); //

        System.out.println(numsList);

    }//end of main

}
//this is the class we will call as a 2nd parameter inside the sort method above
//class MyNumbers implements Comparator<Integer> {
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        if(o1 > o2) { //in this case MyNumbers has the first param o1 > o2
//            return 1; //current id is bigger than
//        } else if (o1 < o2) {
//            return -1; //current id is smaller than other id
//        } else {
//            return 0; //if the numbers/integers are the same or equal.
//    }
//  }
//}
            //we add two more numbers to the list
//        numsList.add(20);
//        numsList.add(2);


//        Collections.sort(numsList, new MyNumbers());
//
//        System.out.println(numsList);




//in this case MyNumbers has the first param o1 < o2
class MyNumbers implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) {
            return 1; //current id is smaller than
        } else if (o1 > o2) {
            return -1; //current id is bigger than other id
        } else {
            return 0; //if the numbers/integers are the same or equal.
        }
    }
}
