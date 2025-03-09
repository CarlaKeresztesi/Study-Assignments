package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // OO Design
        //Class = blueprint to create - instantiate - an object from
        //declared before the obj is created
        //light memory footprint


        //Object = instance of a class
        //Fields (state) & Method (behaviour)
        //can 'communicate' with other objects
        //they represent real world entity - cat, dog, address, house, anything we can represent and think of
        //


        //4 pillars of Object-Oriented Programming:

            //Abstraction - focusing on methods - what behaviour should a class have but not tell it how to do it - the makeSound() in Zoo
                            // void makeSound() {
                            //               System.out.println("growl");}
                            // is about the behaviour - leave it to the class to decide what to implement there
                           // Interfaces - completely abstract classes - group a set of behaviours for a type of
                                            //  entities that we want these entities to implement

            //Encapsulation - protecting or hiding away internal details/state of an object - make the filed private and have setters and getters to access it
                            //through public methods (i.e. getters and setters)
                            //using private, protected, public access modifiers

            // Inheritance - extends Class -> allows a child to inherit properties and behaviours from parent class -> IS-A relationship
                                //Lion extends Animal -> Lion IS-A animal
                            //Superclass (is parent class)
                            //promotes code reusability - let you group related state and behaviour into a super entity that can be inherited

            //Polymorphism -
                            //- Method Overriding = child class modifies parent class methods - overridden by child class method definition
//        class Animal {
//            void makeSound() {
//                System.out.println("Animal makes a sound");
//            }
//        }
//
//        class Dog extends Animal {
//            @Override
//            void makeSound() {
//                System.out.println("Bark");
//            }
//        }
                            //- Method Overloading = multiple methods with same name but different parameter signatures.
//        class MathOperations {
//            int add(int a, int b) {
//                return a + b;
//            }
//
//            int add(int a, int b, int c) {
//                return a + b + c;
//            }
//        }


        }
    }
//end of main