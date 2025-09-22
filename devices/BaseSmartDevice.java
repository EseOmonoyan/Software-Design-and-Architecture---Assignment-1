package devices;
public class BaseSmartDevice {
    private final String brand;
    private final String model;
    private int usage;

    public BaseSmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.usage = 0;
    }

    
}
