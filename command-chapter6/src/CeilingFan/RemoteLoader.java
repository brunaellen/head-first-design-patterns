package CeilingFan;

public class RemoteLoader {
    public static void main(String[] args) {
        final RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        final CeilingFan ceilingFan = new CeilingFan("Living Room");
        
        // we instantiate three commands
        final CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        final CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        final CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        
        // we put medium in slot zero
        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        // we put high in slot one
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        System.out.println(remoteControl);
        
        // turn the fan on medium
        remoteControl.onButtonWasPushed(0);
        // then turn it off
        remoteControl.offButtonWasPushed(0);
        // undo. It should go back to medium
        remoteControl.undoButtonWasPushed();
        
        // turn on to high
        remoteControl.onButtonWasPushed(1);

        // undo
        remoteControl.undoButtonWasPushed();
    }
}
