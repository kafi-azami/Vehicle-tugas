public class convertible extends car{
    private String roofType;

    public convertible(int numWheels, double price, int numDoors, boolean isElectric, String roofType) {
        super(numWheels, price, numDoors, isElectric); 
        this.roofType = roofType;
    }

    public String getRoofType() {
        return this.roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

  
}
