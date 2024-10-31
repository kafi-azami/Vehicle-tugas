public class bicycle extends vehicle{
    private String bikeType;

    public bicycle(int numWheels, double price, String bikeType) {
        super(numWheels, price);
        this.bikeType = bikeType;
    }

    public String getBikeType() {
        return this.bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    @Override
    public void print() {
        super.print(); 
        System.out.println("Ini adalah sepeda jenis " + bikeType);
    }

   
}
