class Device {
    int deviceId; String status;
    void displayStatus() { System.out.println(deviceId+" "+status); }
}
class Thermostat extends Device {
    int temperatureSetting;
    void displayStatus() { System.out.println("Device "+deviceId+" Temp "+temperatureSetting+"°C "+status); }
}
public class SmartHomeMain {
    public static void main(String[] args) {
        Thermostat t = new Thermostat();
        t.deviceId = 101;
        t.status = "ON";
        t.temperatureSetting = 24;
        t.displayStatus();
    }
}
