/**
 * Animal class extending SoundMaker.
 */
public abstract class Animal implements SoundMaker {
    static int numberofAnimals = 0;
    String name;

    /**
     * Default constructor
     */
    public Animal() {
        numberofAnimals++;
        System.out.println("Animal Constructor called");
        this.name = "Unkown Animal";
    }

    /**
     * Parameterized constructor.
     * 
     * @param name The name of the Animal.
     */
    public Animal(String name) {
        numberofAnimals++;
        System.out.println("Animal Consructor with name called");
        this.name = name;
    }

    public abstract String getAnimalType();

    public int getNumberofAnimals() {
        return numberofAnimals;
    }

}
