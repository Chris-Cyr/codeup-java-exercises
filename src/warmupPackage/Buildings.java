package warmupPackage;

public class Buildings {
    protected int numberOfFloors;
    protected String buildingUse;
    public Buildings (int numberOfFloors, String buildingUse){
    }
    public Buildings(String buildingUse){this.buildingUse = buildingUse;}
    public Buildings(int numberOfFloors){this.numberOfFloors = numberOfFloors;}
    public void report() {System.out.println("This building has " + numberOfFloors + " floors and its use is: " + buildingUse + ".");}

    public static void main(String[] args) {
        Buildings house1 = new Residential();
        house1.numberOfFloors = 2;
        house1.buildingUse = "Residential";
        house1.report();
    }

}
