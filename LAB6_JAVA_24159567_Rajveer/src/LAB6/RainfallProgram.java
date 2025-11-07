package LAB6;

import java.io.*;
import java.lang.NumberFormatException;
import java.lang.IllegalStateException;

public class RainfallProgram {
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(
                new InputStreamReader(System.in)
        );

        RainfallStats stats = new RainfallStats();
        System.out.println("Enter rainfall measurements (in mm), or \"end\" to stop.");

        while(true) {
            System.out.print("> ");
            String line = keyboard.readLine();
            if("end".equalsIgnoreCase(line.trim())) { // Using trim() and equalsIgnoreCase for robustness
                break;
            }

            try {
                // Parse the measurement from String to double [cite: 41, 42, 43]
                double measurement = Double.parseDouble(line.trim());

                // Add the measurement to stats. This may throw InvalidRainfallException.
                stats.addMeasurement(measurement);

            } catch (NumberFormatException e) {
                // Catch NumberFormatException thrown by Double.parseDouble()
                // Print a message if the measurement cannot be parsed [cite: 51, 52]
                System.out.println("Invalid number (enter \"end\" to stop).");

            } catch (InvalidRainfallException e) {
                // Catch InvalidRainfallException (negative measurement) [cite: 22, 37]
                // Print a message if the measurement is negative [cite: 49, 50]
                System.out.println("Measurement must not be negative.");
            }
        }

        System.out.println(stats.getCount() + " measurement(s) entered."); // [cite: 7, 54]

        // Prevent the IllegalStateException when no measurements have been entered [cite: 39, 55]
        if (stats.getCount() > 0) {
            try {
                // Print the mean [cite: 8] and max [cite: 9]
                System.out.printf("Mean rainfall: %.3f mm%n", stats.getMean());
                System.out.printf("Maximum rainfall: %.1f mm%n", stats.getMax());
            } catch (IllegalStateException e) {
                // This catch block will not execute because of the if-check.
            }
        }
    }
}