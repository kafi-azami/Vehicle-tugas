public class vehicle {
    private int numWheels;
    private double price;

    public vehicle(int numWheels, double price) {
        this.numWheels = numWheels;
        this.price = price;
    }

    public int getNumWheels() {
        return this.numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void print() {
        System.out.println("Vehicle dengan " + numWheels + " roda dan harga " + price);
    }
}
