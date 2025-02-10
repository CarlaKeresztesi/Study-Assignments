import java.util.ArrayList;
import java.util.List;

public class Farm {

    public List<Animal> listOfAnimals = new ArrayList<>();

    public Farm() {
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Cow());
        listOfAnimals.add(new Duck());
    }

    public List<Animal> getAnimals() {
        return listOfAnimals;
    }

    public List<CanMakeSound> getAnimalsThatMakeSound() {
        List<CanMakeSound> animalsMakeSound = new ArrayList<>();
        for (Animal animal : listOfAnimals) {
            if (animal instanceof CanMakeSound) {
                animalsMakeSound.add((CanMakeSound) animal);
            }
        }
        return animalsMakeSound;
    }

    public List<CanFly> getAnimalsThatFly() {
        List<CanFly> animalsThatFly = new ArrayList<>();
        for (Animal animal : listOfAnimals) {
            if (animal instanceof CanFly) {
                animalsThatFly.add((CanFly) animal);
            }
        }
        return animalsThatFly;


    }

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


