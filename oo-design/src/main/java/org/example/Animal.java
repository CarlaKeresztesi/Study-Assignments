package org.example;

public abstract class Animal {
        protected String name;
        protected String breed;

        //constructor
        public Animal(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }

        //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    //method
    public abstract void sound();



}//end of Animal class
