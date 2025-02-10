package collectionsexample;

import javax.security.auth.callback.LanguageCallback;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
        public static void main(String[] args) {

            ArrayList<String> languages = new ArrayList<>();
            //.size()
            System.out.println(languages.size());
            //.isEmpty()
            System.out.println(languages.isEmpty());

            languages.add("Java");
            languages.add("C#");
            languages.add("Scala");
            languages.add("Kotlin");

            System.out.println(languages.size());
            System.out.println(languages.isEmpty());

            //.contains()
            System.out.println(languages.contains("C++")); //-->false
            System.out.println(languages.contains("Kotlin")); //-->true

            //.clear() - deletes all elem of the list at once
            languages.clear();
            if(languages.isEmpty()) { //if condition satisfied so it returned true
                System.out.println("The clear() method deleted all elements"); //worked
            } else {
                System.out.println("There is a problem");
            }

            //.equals() = compares the elements of the list in order - returns boolean
            ArrayList<Object> test1 = new ArrayList<>();
            test1.add("Java");
            test1.add("Kotlin");
            test1.add("Scala");

            ArrayList<String> test2 = new ArrayList<>();
            test2.add("Java");
            test2.add("Kotlin");
            test2.add("Scala");

            System.out.println(test1.equals(test2)); //returned true even if data type for the lists are different, as
                                                //elements are the same

            //.equals() - when lists are not identical
            ArrayList<Object> test3 = new ArrayList<>();
            test3.add("Java");
            test3.add("Kotlin");
            test3.add("Scala");

            ArrayList<String> test4 = new ArrayList<>();
            test4.add("Scala");
            test4.add("Kotlin");
            test4.add("Java");

            System.out.println(test3.equals(test4));// returned false









        }//end of main


}
