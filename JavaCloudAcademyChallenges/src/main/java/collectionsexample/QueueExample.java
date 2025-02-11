package collectionsexample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        //create an object from the Queue Interface - objects cannot be created of the type Queue as it is an interface,
        //we always need a class that extends this list in order to create an object - for this we will use the
                //LinkedList class that implements the Deque interface
        Queue<String> animalsQueue = new LinkedList<>();

        animalsQueue.add("Dog");//.add() will throw error and app will crash
        animalsQueue.offer("Cat");//.offer() adds element to the Queue as well, returns null so app won't crash
        animalsQueue.offer("Cow");
        animalsQueue.offer("Lion");
        animalsQueue.offer("Monkey");

        System.out.println("animalsQueue: " + animalsQueue);

        System.out.println("Size of animalsQueue: " + animalsQueue.size());

                                            //element() returns first element in the Queue, throws error
        System.out.println("The first element: " + animalsQueue.element());

                                //peek() also returns first element in the Queue, return null
        System.out.println("The first element: " + animalsQueue.peek());

                                //removes element but throws error
//        System.out.println("Removed element: " + animalsQueue.remove());
//
//                                //removes element but returns null
//        System.out.println("Removed element: " + animalsQueue.poll());

        System.out.println("animalsQueue: " + animalsQueue);

//now testing order in which animals will be deleted from the Queue
        while(!animalsQueue.isEmpty()) { //this will loop through and delete each element in the Queue one by one
            System.out.println("Deleted element: " + animalsQueue.poll());;
        }
        System.out.println("animalsQueue: " + animalsQueue);

        System.out.println("The first element: " + animalsQueue.peek());





    }//end of main

}
