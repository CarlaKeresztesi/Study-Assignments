package collectionsexample;

import java.util.*;

public class ArrayListDeclaration {
    public static void main (String[] args) {
        ArrayList<Object> list1 = new ArrayList<Object>(); //declaring the ArrayList of Objects

        ArrayList<String> list2;  //another way of declaring the same
        list2 = new ArrayList<>();

        ArrayList<Integer> list3 = new ArrayList<>();

        List<Double> list4 = new ArrayList<>(); //ArrayList class implements the List interface --> polymorphism

        Collection<String> list5 = new ArrayList<>();//List extends the Collection interface and the ArrayList implem
                                                //the List too. So the ArrayList is a subclass of the List in Collection

        ArrayList list6 = new ArrayList();//here AL is an Object by default. We can add string, integer, any type etc





    }//end of main


}
