interface SmartDeviceFactory {
    Device createSmartBulb(int powerUsage);
    Device createSmartLock(int batteryConsumption);
}