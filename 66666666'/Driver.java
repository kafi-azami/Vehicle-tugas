import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah roda: ");
        int numWheels = scanner.nextInt();

        System.out.println("Masukkan harga: ");
        double price = scanner.nextDouble();

        System.out.println("Masukkan jumlah pintu: ");
        int numDoors = scanner.nextInt();

        System.out.println("Apakah mobil ini listrik? (true/false): ");
        boolean isElectric = scanner.nextBoolean();

        System.out.println("Masukkan jenis atap (jika convertible): ");
        String roofType = scanner.next();

        convertible myConvertible = new convertible(numWheels, price, numDoors, isElectric, roofType);
        myConvertible.print();

        System.out.println("\nMasukkan jenis sepeda: ");
        String bikeType = scanner.next();

        bicycle myBike = new bicycle(2, 500, bikeType);
        myBike.print();

        scanner.close();
    }

}
