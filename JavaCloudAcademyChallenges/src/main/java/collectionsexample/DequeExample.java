package collectionsexample;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        //create an object from the Queue Interface - objects cannot be created of the type Queue as it is an interface,
        //we always need a class that extends this list in order to create an object - for this we will use the
        // LinkedList class that implements the Deque interface

        Deque<String> animalsDeque = new LinkedList<>();

        animalsDeque.add("Dog");
        animalsDeque.add("Cat");
        animalsDeque.addFirst("Bird"); //after running the app again -> animalsDeque: [Bird, Dog, Cat]
        animalsDeque.addLast("Lion");//run app again -> animalsDeque: [Bird, Dog, Cat, Lion]
        animalsDeque.push("Monkey");//adds to beginning of list -> animalsDeque: [Monkey, Bird, Dog, Cat, Lion]
        animalsDeque.offer("Cow");//adds to end of list -> animalsDeque: [Monkey, Bird, Dog, Cat, Lion, Cow]
        animalsDeque.offerFirst("Horse");//adds to begin of list->animalsDeque: [Chimp, Monkey, Bird, Dog, Cat, Lion, Cow]
        animalsDeque.offerLast("Sheep");// animalsDeque: [Horse, Monkey, Bird, Dog, Cat, Lion, Cow, Sheep]

        System.out.println("animalsDeque: " + animalsDeque);//prints back to back: animalsDeque: [Dog, Cat]

        System.out.println("Deleted element: " + animalsDeque.removeFirst()); //--> Deleted element: Horse

        System.out.println("animalsDeque: " + animalsDeque);//-> animalsDeque: [Monkey, Bird, Dog, Cat, Lion, Cow, Sheep]

        System.out.println("Deleted element: " + animalsDeque.removeLast());//--> Deleted element: Sheep

        System.out.println("animalsDeque: " + animalsDeque);//--> animalsDeque: [Monkey, Bird, Dog, Cat, Lion, Cow]





    }//end of main

}
