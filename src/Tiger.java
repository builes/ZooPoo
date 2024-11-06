/**
 * The Tiger class represents a tiger with specific properties such as number of stripes, speed, and sound level of roar.
 * It extends the Animal class and implements the Walk interface.
 */
public class Tiger extends Animal implements Walk {
    /** The number of stripes on the tiger. */
    private int numberOfStripes;

    /** The speed of the tiger in meters per second. */
    private int speed;

    /** The sound level of the tiger's roar in decibels. */
    private int soundLevel;

    /**
     * Default constructor that initializes the tiger with default values.
     */
    public Tiger() {
        super("Tiger");
    }

    /**
     * Gets the number of stripes on the tiger.
     *
     * @return the number of stripes
     */
    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    /**
     * Sets the number of stripes on the tiger.
     *
     * @param numberOfStripes the new number of stripes
     */
    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    /**
     * Gets the speed of the tiger.
     *
     * @return the speed in meters per second
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the speed of the tiger.
     *
     * @param speed the new speed in meters per second
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Gets the sound level of the tiger's roar.
     *
     * @return the sound level in decibels
     */
    public int getSoundLevel() {
        return soundLevel;
    }

    /**
     * Sets the sound level of the tiger's roar.
     *
     * @param soundLevel the new sound level in decibels
     */
    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    /**
     * Simulates the tiger eating food by printing a message to the console.
     */
    @Override
    public void eatingFood() {
        System.out.println("Tiger: I am eating meat.");
    }

    /**
     * Prints a message indicating the tiger has finished eating.
     */
    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have finished eating.");
    }

    /**
     * Simulates the tiger walking by printing a message to the console.
     */
    @Override
    public void walking() {
        System.out.println("Tiger: I am walking at the speed " + speed + " meters per second.");
    }
}