/**
 * Dog class extending Mammal.
 */
public class Dog extends Mammal {
    /**
     * Default constructor
     */
    public Dog() {
        super();
        System.out.println("Dog Constructor called");
    }

    /**
     * Parameterized constructor.
     * 
     * @param name The name of the dog.
     */
    public Dog(String name) {
        super(name);
        System.out.println("Dog Constructor with name called");
    }

    public void makeSound() {
        System.out.println("Woof!");
    }

    public String getAnimalType() {
        return "Dog";
    }
}
