//Name : Rajveer Singh Saini
//ID : 24159567

package OOPS.Lab2;

// importing Math library
import java.lang.Math ;


// Creating a new class Circle
public class Circle {
    Vector center;
    double radius;

    // Creating a constructor
    public Circle(Vector center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // Returns the diameter of the circle
    public double getDiameter() {
        return Math.abs(2 * this.radius);
    }

    // Returns the area of the circle
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    // Returns true or false based on the condition
    public boolean contains(Vector point) {
        Vector offSet = point.subtract(this.center);
        return (offSet.length() <= this.radius);
    }

    // boundingBox function
    public Rectangle boundingBox() {
        double cx = this.center.x;
        double cy = this.center.y;
        Vector p1 = new Vector(cx - this.radius, cy - this.radius);
        Vector p2 = new Vector(cx + this.radius, cy + this.radius);
        return new Rectangle(p1, p2);
    }

   //Explanation in Rectangle.java
    @Override
    public String toString() {
        return "Centre(x: " + center.x + ", y: " + center.y + ")";
    }

    // All test cases in ShapesMain
    public static void main(String[] args) {
    }


}