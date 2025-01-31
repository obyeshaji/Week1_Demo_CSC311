package Lab1;

public class Car extends Vehicle {
    private String brand;

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }


    public String getBrand() { return brand; }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
    }


    public void honk() {
        System.out.println("Honk, honk!");
    }
}