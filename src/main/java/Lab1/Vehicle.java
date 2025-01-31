package Lab1;

public class Vehicle {
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;


    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }


    public int getNumberOfWheels() { return numberOfWheels; }
    public String getColor() { return color; }
    public float getEngineSize() { return engineSize; }
    public String getFuelType() { return fuelType; }


    public void displayInfo() {
        System.out.println("Vehicle Info:");
        System.out.println("Wheels: " + numberOfWheels);
        System.out.println("Color: " + color);
        System.out.println("Engine Size: " + engineSize + "L");
        System.out.println("Fuel Type: " + fuelType);
    }
}