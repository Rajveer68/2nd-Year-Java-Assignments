//Name : Rajveer Singh Saini
//ID : 24159567

package Lab2;

// importing Math library
import java.lang.Math ;

public class Vector {
    public double x, y;


    // Constructor
    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getting coordinates of x
    public double getX() {
        return x;
    }

    // Getting coordinates of y
    public double getY() {
        return y;
    }

    // Scale function multiplies the current vector by a provided factor value
    public Vector scale(double factor) {
        double newx = this.x * factor;
        double newy = this.y * factor;
        return new Vector(newx ,newy);
    }


    // Subtract Function subtracts the 2 provided vectors
    public Vector subtract(Vector other) {
        double newx = this.x - other.x;
        double newy = this.y - other.y;
        return new Vector(newx ,newy);
    }

    // Length function calculates the actual length by the math foumula sqrt of x^2 + y^2
    public double length() {
        double rsquared = Math.sqrt(this.x * this.x + this.y * this.y);
        return rsquared;
    }


    // add Function adds the 2 provided vectors
    public Vector add(Vector other) {
        double newx = this.x + other.x;
        double newy = this.y + other.y;
        return new Vector(newx ,newy);

    }

    // printVector prints the length and value of our vector
    public void printVector() {
        System.out.println("vector x:" + x );
        System.out.println("Vector y: " + y);
        System.out.println("Vector length: " + length());
    }

   //Explanation in Rectangle.java
    @Override
    public String toString() {
        return "Vector( x: " + getX() + ", y: " + getY() + ")";
    }

    // All test cases in ShapesMain
    public static void main(String[] args) {
    }

}
