package CeilingFan;

class CeilingFanMediumCommand implements Command {
    private final CeilingFan ceilingFan;
    // we've added local state to keep track of the previous speed of the fan
    private int previousSpeed;
    
    public CeilingFanMediumCommand(final CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    
    @Override
    public void execute() {
        // before we change the speed of the fan, we need to first record its previous state
        // just in case we need to undo our actions
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        // we set the speed of the fan back to its previous speed
        switch (previousSpeed) {
            case CeilingFan.HIGH:
                ceilingFan.high();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            default:
                ceilingFan.off();
                break;
        }
    }
}
