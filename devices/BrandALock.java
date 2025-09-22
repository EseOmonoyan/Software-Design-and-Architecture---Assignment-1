package devices;
import usage.FileUsageProvider;
import usage.UsageProvider;
import java.nio.file.Path;

public class BrandALock extends BaseSmartDevice implements SmartLock {
    private final Path dataRoot;
    public BrandALock(String brand, Path dataRoot) {
        super(brand, "Lock");
        this.dataRoot = dataRoot;
    }
    @Override
    protected UsageProvider makeUsageProvider() {
        return new FileUsageProvider(dataRoot.resolve("lock.txt"));
    }
    
}
