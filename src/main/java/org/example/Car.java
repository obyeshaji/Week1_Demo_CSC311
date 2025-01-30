package org.example;

public class Car extends Vehicle {
    private String brand;
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }
    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}

}
@Override
public void displayInfo() {
    super.disp
}