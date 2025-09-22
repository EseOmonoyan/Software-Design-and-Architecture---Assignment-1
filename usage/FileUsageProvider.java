package usage;

import java.nio.file.*;
import java.io.IOException;

public class FileUsageProvider implements UsageProvider {
    private final Path file;

    public FileUsageProvider(Path file) {
        this.file = file;
    }

    @Override
    public int readUsage() {
        try {
            for (String line : Files.readAllLines(file)) {
                String[] kv = line.split("=");
                if (kv.length == 2) {
                    return Integer.parseInt(kv[1].trim());
                }
            }
        } 
        catch (IOException | NumberFormatException ignored) {
        }
        return -1;
    }
}
