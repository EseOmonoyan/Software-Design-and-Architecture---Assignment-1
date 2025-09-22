package devices;

public interface SmartDevice {
    String getBrand();
    String getModel();   // "Bulb" or "Lock"
    int getUsage();      // power (W) for bulbs or battery (%) for locks
}
