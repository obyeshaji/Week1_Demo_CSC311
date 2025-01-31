public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle(2, "Red", 1.5f, "Petrol");
        myVehicle.displayInfo();

        System.out.println();

        Car myCar = new Car(4, "Blue", 2.0f, "Diesel", "Toyota");
        myCar.displayInfo();
    }
}