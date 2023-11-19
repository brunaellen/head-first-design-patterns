package PartyModelWithUndo;

public class TvOffCommand implements Command{
  private final Tv tv;

  public TvOffCommand(final Tv tv) {
    this.tv= tv;
  }

  public void execute() {
    tv.off();
  }

  public void undo() {
    tv.on();
  }
}
