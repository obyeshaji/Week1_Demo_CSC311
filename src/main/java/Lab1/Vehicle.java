public class Vehicle {
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;

    // Constructor
    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }


    public void displayInfo() {
        System.out.println("Vehicle Info:");
        System.out.println("Wheels: " + numberOfWheels);
        System.out.println("Color: " + color);
        System.out.println("Engine Size: " + engineSize + "L");
        System.out.println("Fuel Type: " + fuelType);
    }
}