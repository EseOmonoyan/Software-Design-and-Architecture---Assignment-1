package devices;

import usage.FileUsageProvider;
import usage.UsageProvider;
import java.nio.file.Path;


public class BrandBBulb extends BaseSmartDevice implements SmartBulb{
    super(brand, "Bulb");
    
    private final Path dataRoot;
    public BroadBBulb(String brand, Path dataRoot) {
        this.dataRoot = dataRoot;
    }
    protected UsageProvider makeUsageProvider() {
        return new FileUsageProvider(dataRoot.resolve("bulb.txt"));
    }
}
