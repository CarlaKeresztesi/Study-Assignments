package org.example;

public class Dog extends Animal {

    public Dog(String name, String breed) {
        super(name, breed);
    }

    public void fetchStick() {
        System.out.println(getName() + " fetched their stick.");
    }

    @Override
    public void sound() {
        System.out.printf("Woof Woof goes %s", this.name);
    }


}//end of Dog class
