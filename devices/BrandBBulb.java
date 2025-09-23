package devices;

import usage.FileUsageProvider;
import usage.UsageProvider;

import java.nio.file.Path;

public class BrandBBulb extends BaseSmartDevice implements SmartBulb {
    private final Path dataRoot;
    public BrandBBulb(String brand, Path dataRoot) {
        super(brand, "Bulb");
        this.dataRoot = dataRoot;
    }
    @Override
    protected UsageProvider makeUsageProvider() {
        return new FileUsageProvider(dataRoot.resolve("bulb.txt"));
    }
}
