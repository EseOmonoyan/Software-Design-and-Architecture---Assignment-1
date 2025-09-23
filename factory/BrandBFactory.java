package factory;

import devices.BrandBBulb;
import devices.BrandBLock;
import devices.SmartBulb;
import devices.SmartLock;

import java.nio.file.Path;

public class BrandBFactory implements SmartDeviceFactory {
    private final Path dataRoot;
    public BrandBFactory(Path dataRoot) { this.dataRoot = dataRoot; }

    @Override public SmartBulb createBulb() { return new BrandBBulb("BrandB", dataRoot); }
    @Override public SmartLock createLock() { return new BrandBLock("BrandB", dataRoot); }
}
