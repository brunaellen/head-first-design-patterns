package PartyModelWithUndo;

public class TvOnCommand implements Command{
  private final Tv tv;

  public TvOnCommand(final Tv tv) {
    this.tv = tv;
  }

  public void execute() {
    tv.on();
    tv.setInputChannel();
  }

  public void undo() {
    tv.off();
  }
}
