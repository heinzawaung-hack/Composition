public class MotherBoard {

    private String model;
    private String manufacturer;
    private int cpu;
    private int ram;

    public MotherBoard(String model, String manufacturer, int cpu, int ram) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.cpu = cpu;
        this.ram = ram;
    }

    public void programName(String programName){
        System.out.println("The program " + programName + " is now loaded...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }
}
