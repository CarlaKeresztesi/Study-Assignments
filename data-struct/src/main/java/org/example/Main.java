package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student lola = new Student("Lola");
        Student simon = new Student("Simon");
        Student carla = new Student("Carla");
        List myList = new ArrayList<>();
        myList.add("Remi");
        myList.get(0);

        Set<Student> students = new HashSet<>(Set.of(lola, simon));

        Set<String> voted = new HashSet<>(Set.of("Lola", "Simon", "Carla"));
        voted.add("Adil");

        Iterator<String> it = voted.iterator();

        System.out.println(voted.contains("Lola"));
      //  voted.get(0); NOT POSSIBLE - NO INDEXES

        while(it.hasNext()) {
              System.out.println(it.next());
              System.out.println(voted.size());
        }

        for (String voter : voted) {
            System.out.println(voter + " has voted");
        }

        Map<String, String> contacts = new HashMap<>();
        contacts.put("Sam", "Manchester");
        contacts.put("Remi", "Sydney");
        contacts.put("Sean", "London");
        contacts.put("Ahmed", "Melbourne");

        System.out.println(contacts);

        // keys = contacts.keySet()
        for (String key : contacts.keySet()) {
            System.out.printf("Key: %s", key);
            System.out.println(contacts.get(key).hashCode());
        }

        for (String value : contacts.values()) {
            System.out.printf("Value: %s", value);
            System.out.println(value);
            System.out.println(value.hashCode());
        }



        }
    }//end of main method
