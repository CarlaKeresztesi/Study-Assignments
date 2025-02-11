package collectionsexample;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        Set<String> myCarSet = new HashSet<String>();//the Set is an Interface so options cannot be created from it
        //we always need a class that extends this list in order to create an object

        myCarSet.addAll(Arrays.asList(new String[] {"Ferrari", "Ford", "BMW", "Ford", "Opel", "Hyundai"}));

        System.out.println("myCarSet: " + myCarSet);

        System.out.println("Size of myCarSet: " + myCarSet.size());

        myCarSet.remove("BMW");

        System.out.println("After removing BMW: " + myCarSet);

        System.out.println("Does myCarSet contain Mercedes? " + myCarSet.contains("Mercedes"));

        //adding the println to separate the results from above in the console below.
        System.out.println("*************************************************");

//Compare two different lists using the Set Class

        //making the sets:
        Set<Integer> mySet1 = new HashSet<>();

        mySet1.addAll(Arrays.asList(1,3,4,8,9,7,5));//Arrays.asList =  makes a fixed list containing the enunciated int
                //addAll is method in the Set interface(inherited from Collection)
        System.out.println("mySet1: " + mySet1);

        Set<Integer> mySet2 = new HashSet<>();//Set<Integer> = Collection in Java;
                                              //new HashSet = implementation of the Set interface, order of el is not maintained

        mySet2.addAll(Arrays.asList(1,2,3,6,4,10,4));

        System.out.println("mySet2: " + mySet2);

        //making 3 different comparisons:
        //Union elements - addAll() = a new list that is a combo of elem from both lists:
        Set<Integer> unionSet = new HashSet<>(mySet1);
        unionSet.addAll(mySet2);

        System.out.println("Union set: " + unionSet);

        //Intersection elements - retainAll() = detect the intersecting elements in both lists
        Set<Integer> intersectionSet = new HashSet<>(mySet1);
        intersectionSet.retainAll(mySet2);

        System.out.println("Intersection set: " + intersectionSet);

        //Different elements - removeAll() = elements of one list that are diff from the other list
        Set<Integer> differenceSet = new HashSet<>(mySet1);
        differenceSet.removeAll(mySet2);

        System.out.println("Difference set: " + differenceSet);

        System.out.println("************HashSet***************");

 //HashSet = still no repetition, however doesn't guarantee keeping the list elements in same order
        HashSet<String> hs1 = new HashSet<>();

        hs1.add("Dog");
        hs1.add("Cat");
        hs1.add("Monkey");
        hs1.add("Monkey");
        hs1.add("Cow");
        hs1.add("Lion");
        hs1.add("Lion");
        hs1.add("Snake");

        System.out.println("hs1: " + hs1);//hs1: [Snake, Cat, Monkey, Lion, Cow, Dog]

        System.out.println("************LinkedHashSet***************");

//Linked HashSet = maintains insertion order, contains unique elem(no repetition) and permits null elements
        LinkedHashSet<String> lhs1 = new LinkedHashSet<>();

        lhs1.add("Dog");
        lhs1.add("Cat");
        lhs1.add("Monkey");
        lhs1.add("Monkey");
        lhs1.add("Cow");
        lhs1.add("Lion");
        lhs1.add("Lion");
        lhs1.add("Snake");

        System.out.println("lhs1: " + lhs1);//lhs1: [Dog, Cat, Monkey, Cow, Lion, Snake]

        System.out.println("************TreeSet***************");

//TreeSet = it sorts the added elements from smallest to largest or alphabetical; still no repetitions
        TreeSet<String> myCitiesSet = new TreeSet<>();

        myCitiesSet.add("Paris");
        myCitiesSet.add("London");
        myCitiesSet.add("Rome");
        myCitiesSet.add("Washington");
        myCitiesSet.add("Washington");
        myCitiesSet.add("NewYork");
        myCitiesSet.add("Berlin");
        myCitiesSet.add("Tokyo");
        myCitiesSet.add("Tokyo");
        myCitiesSet.add("Amsterdam");

        System.out.println("Descending: " + myCitiesSet.descendingSet());//Descending: [Washington, Tokyo, Rome,
                                                                        // Paris, NewYork, London, Berlin, Amsterdam]

        System.out.println("myCitiesSet: " + myCitiesSet);//myCitiesSet: [Amsterdam, Berlin, London, NewYork, Paris,
                                                            // Rome, Tokyo, Washington]

        System.out.println("HeadSet: " + myCitiesSet.headSet("NewYork"));//HeadSet: [Amsterdam, Berlin, London]
            //HeadSet returns elements <= the specified element

        System.out.println("SubSet: " + myCitiesSet.subSet("London","Washington"));//SubSet: [London, NewYork, Paris,
             //SubSet returns a set of elements that lie between the given range,                // Rome, Tokyo]
              // which includes from element and excludes to element

        System.out.println("TailSet: " + myCitiesSet.tailSet("NewYork"));//TailSet: [NewYork, Paris, Rome,
                    //TailSet prints the elements from New York to the last element             // Tokyo, Washington]

        System.out.println("First element: " + myCitiesSet.first());//First element: Amsterdam

        System.out.println("Last element: " + myCitiesSet.last());//Last element: Washington

        System.out.println("Retrieve and remove the first element: " + myCitiesSet.pollFirst());//Retrieve and remove
                                                                            // the first element: Amsterdam

        System.out.println("Retrieve and remove the last element: " + myCitiesSet.pollLast());//Retrieve and remove
                                                                                        // the last element: Washington

        System.out.println("myCitiesSet: " + myCitiesSet);//myCitiesSet: [Berlin, London, NewYork, Paris, Rome, Tokyo]

    }//end of main


}
