package PartyModelWithUndo;

public interface Command {
    void execute();
    void undo();
}