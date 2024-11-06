/**
 * The Penguin class represents a penguin with specific properties such as walking speed and swimming speed.
 * It extends the Animal class and implements the Walk and Swim interfaces.
 */
public class Penguin extends Animal implements Walk, Swim {
    /** Indicates if the penguin is swimming. */
    private boolean isSwimming;

    /** The walking speed of the penguin in meters per second. */
    private int walkSpeed;

    /** The swimming speed of the penguin in meters per second. */
    private int swimSpeed;

    /**
     * Default constructor that initializes the penguin with default values.
     */
    public Penguin() {
        super("Penguin");
    }

    /**
     * Checks if the penguin is swimming.
     *
     * @return true if the penguin is swimming, false otherwise
     */
    public boolean isSwimming() {
        return isSwimming;
    }

    /**
     * Sets the swimming state of the penguin.
     *
     * @param swimming the new swimming state of the penguin
     */
    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    /**
     * Gets the walking speed of the penguin.
     *
     * @return the walking speed of the penguin in meters per second
     */
    public int getWalkSpeed() {
        return walkSpeed;
    }

    /**
     * Sets the walking speed of the penguin.
     *
     * @param walkSpeed the new walking speed of the penguin in meters per second
     */
    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    /**
     * Gets the swimming speed of the penguin.
     *
     * @return the swimming speed of the penguin in meters per second
     */
    public int getSwimSpeed() {
        return swimSpeed;
    }

    /**
     * Sets the swimming speed of the penguin.
     *
     * @param swimSpeed the new swimming speed of the penguin in meters per second
     */
    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    /**
     * Simulates the penguin eating food by printing a message to the console.
     */
    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating delicious fish.");
    }

    /**
     * Prints a message indicating the penguin has finished eating.
     */
    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish.");
    }

    /**
     * Simulates the penguin swimming by printing a message to the console.
     */
    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed " + swimSpeed + " meters per second.");
    }

    /**
     * Simulates the penguin walking by printing a message to the console.
     */
    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + walkSpeed + " meters per second.");
    }
}