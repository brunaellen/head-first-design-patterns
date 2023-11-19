package PartyModelWithUndo;

public class Tv {
  private final String location;
  int channel;

  public Tv(final String location) {
    this.location = location;
  }

  public void on() {
    System.out.println(location + " TV is On");
  }

  public void off() {
    System.out.println(location + " TV is Off");
  }

  public void setInputChannel() {
    this.channel = 3;
    System.out.println(location + " TV channel is set for DVD");
  }
}
