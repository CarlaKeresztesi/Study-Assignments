import java.util.ArrayList;
import java.util.List;

public class Farm {
    //add a List of type Animal
    public List<Animal> listOfAnimals = new ArrayList<>();
    //on creation of Farm object it should create a number of different Animal objects and
    // add to them List of animals.
    public Farm() {
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Cow());
        listOfAnimals.add(new Duck());
    }
    //add a method called getAnimals(), which should return a list of all the animals
    public List<Animal> getAnimals() {
        return listOfAnimals;
    }

    //add a method called getAnimalsThatMakeSound(), which should return a list of only those animals that make a sound.
     //Hint: the instance of the list should be CanMakeSound
    public List<CanMakeSound> getAnimalsThatMakeSound() {
        List<CanMakeSound> animalsMakeSound = new ArrayList<>();
        for (Animal animal : listOfAnimals) {
            if (animal instanceof CanMakeSound) {
                animalsMakeSound.add((CanMakeSound) animal);
            }
        }
        return animalsMakeSound;
    }

  //add a method called getAnimalsThatFly(), which should return a list of only those animals that can fly.
    //Hint: the type of list should be CanFly.
    public List<CanFly> getAnimalsThatFly() {
        List<CanFly> animalsThatFly = new ArrayList<>();
        for (Animal animal : listOfAnimals) {
            if (animal instanceof CanFly) {
                animalsThatFly.add((CanFly) animal);
            }
        }
        return animalsThatFly;


    }

    //add a method called getAnimalsThatFlyAndMakeSound(), which should return a list of only those animals that
    //can fly and make a sound. What could the return type be here?
    public List<Animal> getAnimalsThatFlyAndMakeSound() {
        List<Animal> animalsThatFlyAndMakeSound = new ArrayList<>();
        for(Animal animal : listOfAnimals) {
            if (animal instanceof CanFly && animal instanceof CanMakeSound) {
                animalsThatFlyAndMakeSound.add(animal);
            }
        }
    return animalsThatFlyAndMakeSound;
    }

}


