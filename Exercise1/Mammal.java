/**
 * Mammal class extending Animal.
 */
public class Mammal extends Animal {
    static int numberofMammals = 0;

    /**
     * Default constructor
     */
    public Mammal() {
        super();
        numberofMammals++;
        System.out.println("Mammal Constructor with name called");
    }

    /**
     * Parameterized constructor.
     * 
     * @param name The name of the mammal.
     */
    public Mammal(String name) {
        super(name);
        numberofMammals++;
        System.out.println("Mammal Constructor with name called");
    }

    public void makeSound() {
        System.out.println("Mammal sound");
    }

    public String getAnimalType() {
        return "Mammal";
    }

    public int getNumberofMammals() {
        return numberofMammals;
    }
}
