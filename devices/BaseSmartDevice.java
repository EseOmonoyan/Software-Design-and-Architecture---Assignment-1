package devices;

import usage.UsageProvider;

public abstract class BaseSmartDevice implements SmartDevice {
    private final String brand;
    private final String model;
    private int usage;

    protected BaseSmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    //Factory Method where subclass decides which UsageProvider is in use
    protected abstract UsageProvider makeUsageProvider();

    //to populate usage value
    public final void initUsage() {
        this.usage = makeUsageProvider().readUsage();
    }

    @Override public String getBrand() { return brand; }
    @Override public String getModel() { return model; }
    @Override public int getUsage() { return usage; }
}
