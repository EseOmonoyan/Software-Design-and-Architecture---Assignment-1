class SmartBulb implements Device {
    private int powerUsage;

    public void setUsageValue(int value) {
        this.powerUsage = value;
    }

    public String getDescription() {
        return "Smart Bulb with power usage: " + powerUsage + "W";
    }
}