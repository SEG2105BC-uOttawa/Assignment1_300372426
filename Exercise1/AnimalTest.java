import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        // Create and add Animal instances to the list of Animals
        animals.add(new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Unknown animal sound");
            }

            @Override
            public String getAnimalType() {
                return "Unknown Animal";
            }
        });
        animals.add(new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Unknown animal sound");
            }

            @Override
            public String getAnimalType() {
                return "Unknown Animal";
            }
        });
        animals.add(new Animal("animal1") {
            @Override
            public void makeSound() {
                System.out.println("Named animal sound");
            }

            @Override
            public String getAnimalType() {
                return "Animal";
            }
        });
        animals.add(new Animal("animal2") {
            @Override
            public void makeSound() {
                System.out.println("Named animal sound");
            }

            @Override
            public String getAnimalType() {
                return "Animal";
            }
        });
        // Create and add Mammal instances to the list of Mammals
        ArrayList<Mammal> mammals = new ArrayList<>();
        mammals.add(new Mammal());
        mammals.add(new Mammal());
        mammals.add(new Mammal("mammal1"));
        mammals.add(new Mammal("mammal2"));

        // Create and add Bird instances to the list of Birds
        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(new Bird());
        birds.add(new Bird());
        birds.add(new Bird("bird1"));
        birds.add(new Bird("bird2"));

        // Create and add Dog instances to the list of Dogs
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog("dog1"));
        dogs.add(new Dog("dog2"));

        // Create and add Parrot instances to the list of Parrots
        ArrayList<Parrot> parrots = new ArrayList<>();
        parrots.add(new Parrot());
        parrots.add(new Parrot());
        parrots.add(new Parrot("parrot1"));
        parrots.add(new Parrot("parrot2"));

        System.out.println(" ");
        // Demonstrate polymorphism by making all animals sound
        System.out.println("Animals making sounds:");
        for (Animal animal : animals) {
            animal.makeSound();
        }

        System.out.println(" ");

        System.out.println("Mammals making sounds:");
        for (Mammal animal : mammals) {
            animal.makeSound();
        }

        System.out.println(" ");

        System.out.println("Birds making sounds:");
        for (Bird animal : birds) {
            animal.makeSound();
        }

        System.out.println(" ");

        System.out.println("Dogs making sounds:");
        for (Dog animal : dogs) {
            animal.makeSound();
        }

        System.out.println(" ");

        System.out.println("Parrots making sounds:");
        for (Parrot animal : parrots) {
            animal.makeSound();
        }

        System.out.println(" ");

        // Print total numbers of created animals
        System.out.println("number of animals: " + Animal.numberofAnimals);
        System.out.println("number of mammals: " + Mammal.numberofMammals);
        System.out.println("number of birds: " + Bird.numberofBirds);

    }
}
