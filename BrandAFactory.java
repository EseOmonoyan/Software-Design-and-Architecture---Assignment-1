class BrandAFactory implements SmartDeviceFactory {

    public Device createSmartBulb(int powerUsage) {
        SmartBulb bulb = new SmartBulb();
        bulb.setUsageValue(powerUsage);
        return bulb;
    }


    public Device createSmartLock(int batteryConsumption) {
        SmartLock lock = new SmartLock();
        lock.setUsageValue(batteryConsumption);
        return lock;
    }
}