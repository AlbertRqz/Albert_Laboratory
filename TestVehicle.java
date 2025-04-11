import java.util.Scanner;

public class TestVehicle {

    // Base class Vehicle
    static class Vehicle {
        String brand, fuelType;
        int speed;

        Vehicle(String brand, int speed, String fuelType) {
            this.brand = brand;
            this.speed = speed;
            this.fuelType = fuelType;
        }

        void displayInfo() {
            System.out.println("Brand: " + brand + "\nSpeed: " + speed + " km/h\nFuel: " + fuelType);
        }
    }

    // Car subclass
    static class Car extends Vehicle {
        int numDoors;

        Car(String brand, int speed, String fuelType, int numDoors) {
            super(brand, speed, fuelType);
            this.numDoors = numDoors;
        }

        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Doors: " + numDoors);
        }
    }

    // Motorcycle subclass
    static class Motorcycle extends Vehicle {
        boolean hasSidecar;

        Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
            super(brand, speed, fuelType);
            this.hasSidecar = hasSidecar;
        }

        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Sidecar: " + (hasSidecar ? "Yes" : "No"));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Car
        System.out.println("Enter Car details:");
        System.out.print("Brand: ");
        String carBrand = sc.nextLine();

        System.out.print("Speed (km/h): ");
        int carSpeed = sc.nextInt();
        sc.nextLine(); // Clear newline

        System.out.print("Fuel Type: ");
        String carFuel = sc.nextLine();

        System.out.print("Number of Doors: ");
        int carDoors = sc.nextInt();
        sc.nextLine(); // Clear newline

        Car car = new Car(carBrand, carSpeed, carFuel, carDoors);

        // Input for Motorcycle
        System.out.println("\nEnter Motorcycle details:");
        System.out.print("Brand: ");
        String motoBrand = sc.nextLine();

        System.out.print("Speed (km/h): ");
        int motoSpeed = sc.nextInt();
        sc.nextLine(); // Clear newline

        System.out.print("Fuel Type: ");
        String motoFuel = sc.nextLine();

        System.out.print("Has Sidecar (true/false): ");
        boolean hasSidecar = sc.nextBoolean();

        Motorcycle motorcycle = new Motorcycle(motoBrand, motoSpeed, motoFuel, hasSidecar);

        // Display info
        System.out.println("\nCar Details:");
        car.displayInfo();

        System.out.println("\nMotorcycle Details:");
        motorcycle.displayInfo();

        sc.close();
    }
}
