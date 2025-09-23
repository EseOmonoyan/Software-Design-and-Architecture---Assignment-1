package devices;

import usage.FileUsageProvider;
import usage.UsageProvider;

import java.nio.file.Path;

public class BrandBLock extends BaseSmartDevice implements SmartLock {
    private final Path dataRoot;
    public BrandBLock(String brand, Path dataRoot) {
        super(brand, "Lock");
        this.dataRoot = dataRoot;
    }
    
    protected UsageProvider makeUsageProvider() {
        return new FileUsageProvider(dataRoot.resolve("lock.txt"));
    }
}
