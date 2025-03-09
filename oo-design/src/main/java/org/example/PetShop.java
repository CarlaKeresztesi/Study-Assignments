package org.example;

import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private String name;
    private String address;
    //make a structure to put the animals in
    private List<Animal> animals = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void sellPet() {
        System.out.println("We have a sold pet!");
    }



}//end of PetShop
