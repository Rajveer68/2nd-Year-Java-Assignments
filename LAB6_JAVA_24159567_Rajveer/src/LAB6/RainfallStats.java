package LAB6;

import java.lang.IllegalStateException;

public class RainfallStats {

    // Variables: count, total, and max, initialized to 0
    private int count;
    private double total;
    private double max;


    // Constructor - initializes the variables.

    public RainfallStats() {
        this.count = 0;
        this.total = 0.0;
        this.max = 0.0;
    }


    public void addMeasurement(double measurement) throws InvalidRainfallException {
        // Throw InvalidRainfallException if the measurement is negative
        if (measurement < 0) {
            throw new InvalidRainfallException("Measurement must not be negative.");
        }

        // Increment the count of measurements by 1
        this.count++;
        // Add the measurement value to the total measurements
        this.total += measurement;

        // Check the measurement value to determine the maximum measurement recorded
        if (this.count == 1 || measurement > this.max) {
            this.max = measurement;
        }
    }


    // Returns the number of measurements as an integer
    public int getCount() {
        return this.count;
    }


     //Returns the mean of the measurements
     // @throws IllegalStateException if no measurements have been added yet

    public double getMean() throws IllegalStateException {
        // Throw IllegalStateException if no measurements have been added
        if (this.count == 0) {
            throw new IllegalStateException("Cannot compute mean: No measurements added.");
        }

        return this.total / this.count;
    }


      // Returns the largest measurement (as a double)[cite: 30].
      // @throws IllegalStateException if no measurements have been added yet

    public double getMax() throws IllegalStateException {
        // Throw IllegalStateException if no measurements have been added
        if (this.count == 0) {
            throw new IllegalStateException("Cannot compute maximum: No measurements added.");
        }

        return this.max;
    }
}