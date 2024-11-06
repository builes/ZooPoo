/**
 * The Animal class represents a generic animal with basic properties such as name, weight, height, and age.
 * It provides methods to get and set these properties, as well as a method to simulate the animal eating food.
 */
abstract public class Animal implements Eat {

    /** The name of the animal. */
    private String nameOfAnimal;

    /** The weight of the animal in kilograms. */
    private int weight;

    /** The height of the animal in meters. */
    private int height;

    /** The age of the animal in years. */
    private int age;

    /**
     * Default constructor that initializes the animal with default values.
     */
    public Animal() {
        nameOfAnimal = "Unknown Animal";
    }

    /**
     * Constructor that initializes the animal with a specified name.
     *
     * @param nameOfAnimal the name of the animal
     */
    public Animal(String nameOfAnimal) {
    this.nameOfAnimal = nameOfAnimal;
    switch (nameOfAnimal.toLowerCase()) {
        case "tiger":
            this.weight = 220; // average weight of a tiger in kilograms
            this.height = 2; // average height of a tiger in meters
            this.age = 10; // average age of a tiger in years
            break;
        case "dolphin":
            this.weight = 150; // average weight of a dolphin in kilograms
            this.height = 3; // average length of a dolphin in meters
            this.age = 20; // average age of a dolphin in years
            break;
        case "penguin":
            this.weight = 30; // average weight of a penguin in kilograms
            this.height = 1; // average height of a penguin in meters
            this.age = 15; // average age of a penguin in years
            break;
        default:
            this.weight = 90; // default weight in kilograms
            this.height = 1; // default height in meters
            this.age = 5; // default age in years
            break;
    }
}

    /**
     * Gets the name of the animal.
     *
     * @return the name of the animal
     */
    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    /**
     * Sets the name of the animal.
     *
     * @param nameOfAnimal the new name of the animal
     */
    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    /**
     * Gets the weight of the animal.
     *
     * @return the weight of the animal in kilograms
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the animal.
     *
     * @param weight the new weight of the animal in kilograms
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Gets the height of the animal.
     *
     * @return the height of the animal in meters
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the height of the animal.
     *
     * @param height the new height of the animal in meters
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Gets the age of the animal.
     *
     * @return the age of the animal in years
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the animal.
     *
     * @param age the new age of the animal in years
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Simulates the animal eating food by printing a message to the console.
     */
    @Override
    public void eatingFood() {
        System.out.println("The animal: " + nameOfAnimal + " is eating.");
    }
}