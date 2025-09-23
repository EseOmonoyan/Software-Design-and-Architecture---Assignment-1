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
           System.out.println("This Works!");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}