package PartyModelWithUndo;

public class HottubOffCommand implements Command {
  private final Hottub hottub;

  public HottubOffCommand(final Hottub hottub) {
    this.hottub = hottub;
  }

  public void execute() {
    hottub.setTemperature(98);
    hottub.off();
  }
  public void undo() {
    hottub.on();
  }
}
