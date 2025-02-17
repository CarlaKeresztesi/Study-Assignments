package io.nology.farmyard;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class FarmYardChallenge {

    private FarmYard farmYard;
    private final List<Animal> animals;

    public FarmYardChallenge() {
        this.farmYard = new FarmYard();
        animals = farmYard.getAnimals();
    }

    /**
     * Get the total number of animals in the farm yard
     * @return the total number of animals in the farm yard
     */
    public int getAnimalCount() {
        return (int) animals.stream().count(); //casting to an int as .count() provides long
    }
// or just return animals.size();
    /**
     * The total number of cows in the farm yard.
     *
     * @return
     */
    public int getCowCount() {
//        return (int) animals.stream()
//                .filter(animal -> animal.getType() == AnimalType.cow).count();
        return (int) animals.stream()
                .filter(animal -> animal instanceof Cow).count();
    }

    /**
     * Get total number of animals for the given type.
     * @param type
     * @return
     */
    public int getAnimalCountForType(AnimalType type) {

        return (int) animals.stream()
                .filter(animal -> animal.getType() == type).count();
    }

    /**
     * Get total number of animals whose name begins with the given prefix
     * @param prefix
     * @return
     */
    public int getAnimalsWithNameBeginningWith(String prefix) {

        return (int) animals.stream()
                .filter(animal -> animal.getName().toLowerCase().startsWith(prefix.toLowerCase()))
                        .count();
    }

    /**
     * Get the youngest animal, based on age. If more than one is the youngest then just return the first
     * @return
     */
    public Animal getYoungestAnimal() {

        return animals.stream().sorted((a,b) -> a.getAge() - b.getAge()).findFirst().orElse(null);
    }                                                            //if the Optional doesn't return anything, give me null

    /**
     * Get the oldest animal. If more than one is the eldest then just return the first
     * @return
     */
    public Animal getOldestAnimal() {

         return animals.stream().sorted((a,b) -> b.getAge()- a.getAge()).findFirst().orElse(null);
    } // or  return animals.stream().max((a, b) -> Integer.compare(a.getAge(), b.getAge())).orElse(null);

    /**
     * Get the oldest animals, in a List.
     * You will have to do this in two stages, using streams for both!
     * @return
     */
    public List<Animal> getOldestAnimals() {

        int ageOfEldest = this.animals.stream().sorted((animal1, animal2) -> animal2.getAge() -animal1.getAge()).findFirst().orElse(null).getAge();
        return this.animals.stream().filter(animal -> animal.getAge() == ageOfEldest).toList();
//        int maxAge = animals.stream().mapToInt(animal -> animal.getAge()).max().getAsInt() ;
//        return animals.stream().filter(animal -> animal.getAge() == maxAge).collect(Collectors.toList());
    }

    /**
     * Get a list of all animals of the given type.
     * Order the results by name.
     * @param type
     * @return
     */
    public List<Animal> getAnimalsForType(AnimalType type) {
        //filters and sorts animals of a specific type by name
        return animals.stream().filter(animal -> animal.getType() == type)
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .toList(); //or .collect(Collectors.toList())
    }

    public Map<AnimalType, Long> getCountsOfAnimalsByType() {
        //counts animals by type
        return animals.stream().collect(Collectors.groupingBy(Animal::getType, Collectors.counting()));
    } //(Animal::getType = animal -> animal.getType()

    public Map<AnimalType, List<Animal>> getMapOfAnimalsByType() {
        //groups animals by type - says that we don't want a number of each, we just want a list of each animal type
        return animals.stream().sorted((a, b) -> a.getName().compareTo(b.getName()))
                .collect(Collectors.groupingBy(Animal::getType));
        } //groupingBy will use the value attributed as a key
}
