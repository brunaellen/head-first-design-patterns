package PartyModelWithUndo;

public class Stereo {
    private final String location;

    Stereo(final String location) {
        this.location = location;
    }
    
    public void on() {
        System.out.println(this.location + " stereo is on");
    }
    
    public void off() {
        System.out.println(this.location + " stereo is off");
    }

    public void setCd() {
        System.out.println(location + " stereo is set for CD input");
    }

    public void setVolume(final int volume) {
        System.out.println(location + " Stereo volume set to " + volume);
    }
}
