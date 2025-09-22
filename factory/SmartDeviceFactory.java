package factory;

import devices.SmartBulb;
import devices.SmartLock;

// Abstract Factory — creates product families (bulb + lock)
public interface SmartDeviceFactory {
    SmartBulb createBulb();
    SmartLock createLock();
}
