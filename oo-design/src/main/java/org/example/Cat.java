package org.example;

public class Cat extends Animal {

    public Cat(String name, String breed) {
        super(name, breed);
    }

    public void scratch() {
        System.out.println(getName() + " scratched.");
    }

    @Override
    public void sound() {
        System.out.printf("Meow meow goes %s", this.name);
    }


}//end of Cat class
