package PartyModelWithUndo;

public class Light {
    private final String location;

    Light(final String location) {
        this.location = location;
    }
    public void on() {
        System.out.println(this.location + " light is on");
    }
    public void off() {
        System.out.println(this.location + " light is off");
    }
}
