//Name : Rajveer Singh Saini
//ID : 24159567

package Lab2;


public class ShapesMain {
    public static void main(String[] args) {
        // Initialising and declaring Vectors
        Vector v1 = new Vector(6, 4);
        Vector v2 = new Vector(2, 2);
        System.out.println();
        // Test 1: Function calls to all the Functions in Vector Class
        System.out.println("Testing Vector class functions");

        System.out.println("Printing Vector 1:");
        v1.printVector();
        System.out.println();

        System.out.println("Printing Vector 2:");
        v2.printVector();
        System.out.println();

        System.out.println("Adding previous 2 Vectors");
        Vector sum = v1.add(v2);
        sum.printVector();
        System.out.println();

        System.out.println("Subtracting previous 2 Vectors");
        Vector sub = v1.subtract(v2);
        sub.printVector();
        System.out.println();

        System.out.println("Scaling Vector 1");
        Vector v5 = v1.scale(4);
        v5.printVector();
        System.out.println();

        System.out.println("Scaling Vector 2");
        Vector v6 = v2.scale(5);
        v6.printVector();
        System.out.println();

        System.out.println("Test 1 Completed");
        System.out.println();


        // Test 1: Function calls to all the Functions in Rectangle Class
        System.out.println("Testing Rectangle class functions");

        // Initializing and declaring Vectors for Rectangle class
        Vector a1 = new Vector(1,2);
        Vector a2 = new Vector(3,4);

        Rectangle rect = new Rectangle(a1,a2);

        Vector p = new Vector(2,4);
        System.out.println("Does rectangle contains point (2,4)? : " + rect.contains(p));

        System.out.println("Calling All the functions from Rectangle Class at once with printing both the vectors first:");
        rect.printRectangle();
        System.out.println();

        System.out.println("Test 2 Completed");
        System.out.println();

        // Initialising and declaring Vector and centre for circle
        Vector r1 = new Vector(2,4);
        Circle c1 = new Circle(r1,4);
        // Test 3: Function calls to all the Functions in Circle Class
        System.out.println("Testing Circle class functions");
        System.out.println();

        System.out.println("Printing the centre coordinates of our circle");
        System.out.println(c1);
        System.out.println();

        System.out.println("Calculating Area of the given Circle");
        System.out.println("Area: " + c1.getArea());
        System.out.println();

        System.out.println("Calculating Diameter of the circle");
        System.out.println("Diameter: " + c1.getDiameter());
        System.out.println();

        System.out.println("Getting the coordinates for smallest rectangle that fully encloses the circle and which is also parallel to axes:");
        System.out.println(c1.boundingBox());
        System.out.println();

        System.out.println("Test 3 Completed");


    }
}
