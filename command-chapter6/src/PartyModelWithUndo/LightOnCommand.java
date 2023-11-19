package PartyModelWithUndo;

// implement a commmand for turning a light on
public class LightOnCommand implements Command {
    private final Light light;

    // the constructor is passed the specific light that this command is going to control and stashes it in the light instance variable. When execute gets called, this is the light object that is going to be the Receiver of the request
    public LightOnCommand(final Light light) {
        this.light = light;
    }

    // the execute method calls the on() method on the receiving object, which is the light we are controlling
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}