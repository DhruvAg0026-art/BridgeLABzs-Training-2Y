// SmartDevice.java
public interface SmartDevice {
    void turnOn();
    void turnOff();
}
// Light.java
public class Light implements SmartDevice {
    @Override
    public void turnOn() { System.out.println("Light: ON"); }
    @Override
    public void turnOff() { System.out.println("Light: OFF"); }
}
// AC.java
public class AC implements SmartDevice {
    @Override
    public void turnOn() { System.out.println("AC: Cooling ON"); }
    @Override
    public void turnOff() { System.out.println("AC: OFF"); }
}
// TV.java
public class TV implements SmartDevice {
    @Override
    public void turnOn() { System.out.println("TV: Power ON"); }
    @Override
    public void turnOff() { System.out.println("TV: Power OFF"); }
}

public class SmartDeviceControlInterface {
    // SmartHomeDemo.java
public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartDevice[] devices = { new Light(), new AC(), new TV() };
        for (SmartDevice d : devices) {
            d.turnOn();
        }
        System.out.println("--- later ---");
        for (SmartDevice d : devices) {
            d.turnOff();
        }
    }
}

    
}
