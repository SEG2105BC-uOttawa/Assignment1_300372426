/**
 * Bird class extending Bird.
 */
public class Bird extends Animal {
    public static int numberofBirds = 0;

    /**
     * Default constructor
     */
    public Bird() {
        super();
        numberofBirds++;
        System.out.println("Bird Constructor called");
    }

    /**
     * Parameterized constructor.
     * 
     * @param name The name of the Bird.
     */
    public Bird(String name) {
        super(name);
        numberofBirds++;
        System.out.println("Bird Constructor with name called");
    }

    public void makeSound() {
        System.out.println("Bird sound");
    }

    public String getAnimalType() {
        return "Bird";
    }

    public int getNumberofMammals() {
        return numberofBirds;
    }
}
