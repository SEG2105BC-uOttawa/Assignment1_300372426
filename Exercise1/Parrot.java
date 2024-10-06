/**
 * Parrot class extending Bird.
 */
public class Parrot extends Bird {
    /**
     * Default constructor
     */
    public Parrot() {
        super();
        System.out.println("Parrot Constructor called");
    }
    /**
     * Parameterized constructor.
     * @param name The name of the parrot.
     */
    public Parrot(String name) {
        super(name);
        System.out.println("Parrot Constructor with name called");
    }

    public void makeSound() {
        System.out.println("Squawk!");
    }

    public String getAnimalType() {
        return "Parrot";
    }
}