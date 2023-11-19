package PartyModelWithUndo;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoteControlWithUndo {
    // this time around the remote is going to handle seven On and Off commands
    // which we'll hold in corresponding arrays
    private final Command[] onCommands;
    private final Command[] offCommands;
    Command undoCommand;
    
    public RemoteControlWithUndo() {
        // in the constructor all we need to do is
        //instantiate and initialize the on and off arrays
        onCommands = new Command[7];
        offCommands = new Command[7];
        
        // we assign every slot a NoCommand object by default and we know
        // we'll always have some command to call in each slot
        final Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }
    
    // the setCommand method takes a slot position and an On and Off command
    // to be stored in that slot.
    public void setCommand(final int slot, final Command onCommand, final Command offCommand) {
        // It puts these commands in the on and off arrays for later use
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    
    // when an On or Off button is pressed, 
    // the hardware takes care of calling the corresponding methods
    // onButtonWasPushed or offButtonWasPushed
    public void onButtonWasPushed(final int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    
    public void offButtonWasPushed(final int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
    
    // we've overwritten toString to print out 
    // each slot and its corresponding command
    @Override
    public String toString() {
        return "\n----- Remote Control -----\n" +
            IntStream.range(0, onCommands.length)
                .mapToObj(i -> String.format("[slot %d] %s %s\n", i,
                    onCommands[i].getClass().getName(),
                    offCommands[i].getClass().getName()))
                .collect(Collectors.joining());
    }
}
