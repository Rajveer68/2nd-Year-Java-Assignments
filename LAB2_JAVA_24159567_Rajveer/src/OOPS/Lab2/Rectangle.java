//Name : Rajveer Singh Saini
//ID : 24159567

package OOPS.Lab2;

// importing Math library
import java.lang.Math ;

//Creating a rectangle class
public class Rectangle {
    Vector v1;
    Vector v2;

    // Creating a Constructor
    public Rectangle(Vector v1, Vector v2){
        this.v1 = v1;
        this.v2 = v2;
    }

    // Returns the width
    public double getWidth(){
        return Math.abs(this.v2.x - this.v1.x);
    }


    // Returns the height
    public double getHeight(){
        return Math.abs(this.v2.y - this.v1.y);
    }


    // Returns the Area
    public double getArea(){
        return Math.abs(this.getWidth() * this.getHeight());
    }


    // Returns the center
    public Vector getCenter(){
        double centerX = (this.v1.x + this.v2.x)/2.0;
        double centerY = (this.v1.y + this.v2.y)/2.0;
        return new Vector(centerX , centerY);

    }


    // Returns a boolean value based on conditions given

    public boolean contains(Vector point){
        return (point.x >= v1.x && point.x <= v2.x && point.y >= v1.y && point.y <= v2.y );
    }


    // Prints the values
    public void printRectangle(){

        this.v1.printVector();
        System.out.println();

        this.v2.printVector();
        System.out.println();

        System.out.println("Heigh of Rectangle : "  +getHeight());
        System.out.println("Width of the rectangle : " + getWidth());
        System.out.println("Area of the rectangle : " + getArea());
        System.out.println("Center of the rectangle : " + getCenter());
    }
    //Lab2.Vector@7530d0a is Java’s default toString() output for an object.
    // Testing all the functions in the ShapesMain File


    // Overrides the default toString() method from the Object class.
    // This method defines how a Vector object is represented as text when printed.
    // Instead of showing the class name and memory address (e.g., Lab2.Vector@7530d0a),
    // it now returns the vector in a readable (x, y) coordinate format, e.g., "(3.0, 4.0)".

    @Override
    public String toString() {
        return "Rectangle(v1: (" + v1.x + ", " + v1.y + "), v2: (" + v2.x + ", " + v2.y + "))";
    }

    // All test cases in ShapesMain
    public static void main(String args[]){
    }
}