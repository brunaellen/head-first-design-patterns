package CeilingFan;

// CeilingFan class from the vendor classes
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private final String location;
    // holds local state representing the speed of the ceiling fan
    private int speed;

    public CeilingFan(final String location) {
        this.location = location;
        speed = OFF;
    }

    // these methods set the speed of the ceiling fan
    public void high() {
        speed = HIGH;
        System.out.printf("%s - ceiling fan is on high %n", location);
        // code to set fan to high
    }
     public void medium() {
        speed = MEDIUM;
         System.out.printf("%s - ceiling fan is on medium %n", location);
        // code to set fan to medium
    }
    public void low() {
        speed = LOW;
        System.out.printf("%s - ceiling fan is on low %n", location);
        // code to set fan to low
    }
    public void off() {
        speed = OFF;
        System.out.printf("%s - ceiling fan is off %n", location);
        // code to set fan off
    }

    public int getSpeed() {
        return speed;
    }
}