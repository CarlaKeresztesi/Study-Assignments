package collectionsexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConversionsListsArray {
    public static void main(String[] args) {

        //List --> Array
        List<String> list1 = new ArrayList<>();
        list1.add("Ferrari");
        list1.add("Mercedes");
        list1.add("BMW");
        list1.add("Ford");

            //Object[] myArray = myList.toArray()
//        Object[] array1 = list1.toArray(); //this method returns the object array so we have to assign a new array

            //Object[] myArray = new Object[myList.size()]    myArray = myList.toArray(myArray)
       // String[] array1 = new String[list1.size()];
        //String[] array1 = list1.toArray(new String[list1.size()]);

        String[] array1 = list1.toArray(new String[list1.size()]);
        for (int i = 0; i < list1.size(); i++) {
            array1[i] = list1.get(i); //gets the elements of the list at index i
        }

        list1.add("Opel");

        System.out.println(list1);
        System.out.println(Arrays.toString(array1)); //console looks the same for both prints

        //Array --> List
        String[] animalsArray = new String[] { "Dog", "Cat", "Cow", "Lion"};

          List<String> animalsList = Arrays.asList(animalsArray);
      //  ArrayList<String> animalsList = new ArrayList<>(Arrays.asList(animalsArray); - this is same as above

       // ArrayList<String> animalsList = new ArrayList<>();
       // Collections.addAll(animalsList, animalsArray); //output is the same

       /* for (String animal : animalsArray) { //in each iteration the elements of the array
            animalsList.add(animal);         //will be added to the arrayList
        }*/

    //    animalsList.add("Monkey"); //if we do the conversion with .asList() we can no longer add elements to the list
                                   // because these will now be linked array and we can no longer add elements since
                                   // the arrays are fixed in size
        //if we change an element of the ArraysList, both will be changed
        //animalsArray[0] = "Rabbit";

        animalsList.set(0, "Rabbit"); //both the List and the ArrayList changed

        System.out.println(Arrays.toString(animalsArray));
        System.out.println(animalsList);






    }//end of main

}
