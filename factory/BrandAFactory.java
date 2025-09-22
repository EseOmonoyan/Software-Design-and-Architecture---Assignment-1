package factory;
import devices.BrandABulb;
import devices.BrandALock;
import devices.SmartBulb;
import devices.SmartLock;

import java.nio.file.Path;

public class BrandAFactory implements SmartDeviceFactory{
     private final Path dataRoot;
    public BrandAFactory(Path dataRoot) { this.dataRoot = dataRoot; }

    @Override public SmartBulb createBulb() { return new BrandABulb("BrandA", dataRoot); }
    @Override public SmartLock createLock() { return new BrandALock("BrandA", dataRoot); }
    
}
