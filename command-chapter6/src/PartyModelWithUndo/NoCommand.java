package PartyModelWithUndo;

public class NoCommand implements Command {
    // implement a command that does nothing
    @Override
    public void execute() {}

    @Override
    public void undo() {}
}
