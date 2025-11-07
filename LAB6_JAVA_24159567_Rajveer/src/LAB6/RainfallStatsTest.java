package LAB6;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.IllegalStateException;

public class RainfallStatsTest {
    // creating a new instance of the test class for every test method.
    private final RainfallStats stats = new RainfallStats();


    //  The count should initially be 0.
    @Test
    public void testInitialState() {
        assertEquals(0, stats.getCount());
    }

    // EXCEPTION TESTS

     // If no measurements have been added, the getMean method
     //should throw an IllegalStateException.
    @Test (expected = IllegalStateException.class) // Syntax for testing exceptions
    public void testMeanOfNoMeasurements() {
        // Call the method that throws the test
        stats.getMean();
    }


     // If no measurements have been added, the getMax method
     //should throw an IllegalStateException.
    @Test (expected = IllegalStateException.class) // Syntax for testing exceptions
    public void testMaxOfNoMeasurements() {
        // Call the method that throws the test
        stats.getMax();
    }


    //FUNCTIONAL TESTS (REQUIRED FIX: ADD 'throws InvalidRainfallException')

     // If one measurement is added, the count should be one,
     //and the mean and max should equal that measurement.
    @Test
    public void testAddMeasurement() throws InvalidRainfallException { // FIX APPLIED HERE
        stats.addMeasurement(4.0);
        assertEquals(1, stats.getCount());
        assertEquals(4.0, stats.getMean(), 0);
        assertEquals(4.0, stats.getMax(), 0);
    }


    //  After three measurements are added, the count should be 3.
    @Test
    public void testCount() throws InvalidRainfallException { // FIX APPLIED HERE
        stats.addMeasurement(3.0);
        stats.addMeasurement(5.0);
        stats.addMeasurement(4.0);
        assertEquals(3, stats.getCount());
    }


    //  Test the mean of three measurements.
    @Test
    public void testMean() throws InvalidRainfallException { // FIX APPLIED HERE
        stats.addMeasurement(3.0);
        stats.addMeasurement(5.0);
        stats.addMeasurement(4.0);
        assertEquals(4.0, stats.getMean(), 0);
    }


    //  Test the max of three measurements.
    @Test
    public void testMax() throws InvalidRainfallException { // FIX APPLIED HERE
        stats.addMeasurement(3.0);
        stats.addMeasurement(5.0);
        stats.addMeasurement(4.0);
        assertEquals(5.0, stats.getMax(), 0);
    }
}