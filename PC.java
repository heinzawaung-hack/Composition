public class PC {
    private MotherBoard theMotherBoard;
    private Monitor theMonitor;
    private Case theCase;

    public PC(MotherBoard theMotherBoard, Monitor theMonitor, Case theCase) {
        this.theMotherBoard = theMotherBoard;
        this.theMonitor = theMonitor;
        this.theCase = theCase;
    }

    public MotherBoard getTheMotherBoard() {
        return theMotherBoard;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public Case getTheCase(){
        return theCase;
    }
}
