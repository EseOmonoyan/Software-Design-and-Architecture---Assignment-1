import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        // Read values from file and create devices
        SmartDeviceFactory brandAFactory = new BrandAFactory();
        SmartDeviceFactory brandBFactory = new BrandBFactory();
        //tries to read a file for values
        try (BufferedReader br = new BufferedReader(new FileReader("device_values.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split each line by the colon to separate the device type and value
                String[] parts = line.split(":");
                // Check if the line contains both device type and value
                if (parts.length == 2) {
                    //First part is device type, second part is the value converted to an integer
                    String deviceType = parts[0];
                    int value = Integer.parseInt(parts[1]);
                    //If statement to determine what Brand of bulb to output to user
                    if (deviceType.equals("BrandA_Bulb_Power")) {
                        Device bulb = brandAFactory.createSmartBulb(value);
                        System.out.println(bulb.getDescription());
                    } else if (deviceType.equals("BrandB_Lock_Battery")) {
                        Device lock = brandBFactory.createSmartLock(value);
                        System.out.println(lock.getDescription());
                    }
                }
            }
            //Catch in case the try case doesn't work.
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}