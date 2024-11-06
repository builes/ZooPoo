/**
 * The Dolphin class represents a dolphin with specific properties such as color and swimming speed.
 * It extends the Animal class and implements the Swim interface.
 */
public class Dolphin extends Animal implements Swim {

    /** The color of the dolphin. */
    private String color;

    /** The swimming speed of the dolphin in meters per second. */
    private int swimmingSpeed;

    /**
     * Default constructor that initializes the dolphin with default values.
     */
    public Dolphin() {
        super("Dolphin");
    }

    /**
     * Gets the color of the dolphin.
     *
     * @return the color of the dolphin
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the dolphin.
     *
     * @param color the new color of the dolphin
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets the swimming speed of the dolphin.
     *
     * @return the swimming speed of the dolphin in meters per second
     */
    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    /**
     * Sets the swimming speed of the dolphin.
     *
     * @param swimmingSpeed the new swimming speed of the dolphin in meters per second
     */
    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    /**
     * Simulates the dolphin eating food by printing a message to the console.
     */
    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish.");
    }

    /**
     * Prints a message indicating the dolphin has finished eating.
     */
    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I have eaten fish.");
    }

    /**
     * Simulates the dolphin swimming by printing a message to the console.
     */
    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed " + swimmingSpeed + " meters per second.");
    }
}