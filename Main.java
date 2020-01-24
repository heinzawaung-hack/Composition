import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

    Dimensions theDimensions = new Dimensions(8,15,2);
    Case theCase = new Case("Latitude","Dell","Default",theDimensions);


    Monitor theMonitor = new Monitor("Apple","Apple",15,
            new Resolution(1920,1080));

    MotherBoard theMotherBoard = new MotherBoard("Self Made", "Razer",
            2090,32);

     PC thePC = new PC(theMotherBoard,theMonitor,theCase);

     thePC.getTheMotherBoard().programName("linux");
     thePC.getTheMonitor().drawPixelAt(3,2,"red");
     thePC.getTheCase().pressPower();
        System.out.println("This is " + thePC.getTheMotherBoard().getModel());


    }
}


