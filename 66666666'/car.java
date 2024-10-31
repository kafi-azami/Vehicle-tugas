public class car extends vehicle{
    private int numDoors;
    private boolean isElectric;

    public car(int numWheels, double price, int numDoors, boolean isElectric) {
        super(numWheels, price); 
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }

    public int getNumDoors() {
        return this.numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    @Override
    public void print() {
        super.print(); 
        System.out.println("Ini adalah mobil dengan " + numDoors + " pintu dan " + 
                           (isElectric ? "bertenaga listrik" : "bukan listrik"));
    }

}
