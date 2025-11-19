interface Refuelable {
    void refuel();
}
class Vehicle {
    int maxSpeed; String model;
}
class ElectricVehicle extends Vehicle {
    void charge() { System.out.println("Charging"); }
}
class PetrolVehicle extends Vehicle implements Refuelable {
    public void refuel() { System.out.println("Refueling"); }
}
public class VehicleSystemMain {
    public static void main(String[] args) {
        ElectricVehicle e = new ElectricVehicle();
        PetrolVehicle p = new PetrolVehicle();
        e.charge();
        p.refuel();
    }
}
