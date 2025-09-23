// SmartLock class
class SmartLock implements Device {
    private int batteryConsumption;

    @Override
    public void setUsageValue(int value) {
        this.batteryConsumption = value;
    }

    @Override
    public String getDescription() {
        return "Smart Lock with battery consumption: " + batteryConsumption + "mAh";
    }
}