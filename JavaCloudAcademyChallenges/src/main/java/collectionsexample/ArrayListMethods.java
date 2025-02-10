package collectionsexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListMethods {
    public static void main(String[] args) {

        //.add(element name) or .add(indexNumber, element name)
        ArrayList<Object> myList1 = new ArrayList<>();
        myList1.add(5);
        myList1.add("Java");
        myList1.add(2.8);

        System.out.println(myList1);

        List<String> list2 = new ArrayList<>();
        list2.add("Ferrari");
        list2.add("Mercedes");
        list2.add(2, "BMW"); //adding at index 2 --> position will be 3 inside the list2 array
        list2.add(1, "Ford"); //since we have an elem at index1, it will add this one after the original
                                                //one and shift all the others to the right

        System.out.println(list2);   // --> [Ferrari, Ford, Mercedes, BMW]

        //.remove(indexNumber) or .remove(elementName)
        list2.remove(2); //removes element at index 2, which is the Mercedes --> [Ferrari, Ford, BMW]
        list2.remove("Ferrari"); //removes named element --> [Ford, BMW]

        System.out.println(list2);

        //.set(indexNumber, elementName
        list2.set(1, "Opel");//changes the element at index 1(BMW) with the new element --> [Ford, Opel]

        System.out.println(list2);
        System.out.println(list2.toString()); //does not change the console result - the toString method calls
                                                //automatically in the ArrayList

        //cannot initialise an ArrayList like an array
//        ArrayList<String> newList = {"Ferrari"};//-> we get a compilation error as can't do the same as for arrays




    }//end of main




}
