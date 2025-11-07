package LAB6;


 // Exception thrown when an invalid rainfall measurement is provided
 // (e.g., a negative number).


public class InvalidRainfallException extends Exception {
    public InvalidRainfallException() {
        super();
    }

    public InvalidRainfallException(String message) {
        super(message);
    }
}
