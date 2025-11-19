class Vehicle {
    int maxSpeed; String fuelType;
    void displayInfo() { System.out.println(maxSpeed+" "+fuelType); }
}
class Car extends Vehicle {
    int seatCapacity;
    void displayInfo() { System.out.println("Car "+seatCapacity); }
}
class Truck extends Vehicle {
    int loadCapacity;
    void displayInfo() { System.out.println("Truck "+loadCapacity); }
}
class Motorcycle extends Vehicle {
    String type;
    void displayInfo() { System.out.println("Motorcycle "+type); }
}
public class VehicleMain {
    public static void main(String[] args) {
        Vehicle[] v = {new Car(), new Truck(), new Motorcycle()};
        ((Car)v[0]).seatCapacity=5;
        ((Truck)v[1]).loadCapacity=8000;
        ((Motorcycle)v[2]).type="Sport";
        for(Vehicle x : v) x.displayInfo();
    }
}
