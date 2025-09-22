package factory;

import devices.SmartBulb;
import devices.SmartLock;

public interface SmartDeviceFactory {
    SmartBulb createBulb();
    SmartLock createLock();
}
