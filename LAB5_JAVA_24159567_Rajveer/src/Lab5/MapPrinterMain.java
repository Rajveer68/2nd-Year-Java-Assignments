package Lab5;

import java.util.HashMap;
import java.util.Map;

public class MapPrinterMain {

    public static void main( String[] args){
        // 1. Create a sample map
        Map<String, String> data = new HashMap<>();
        data.put("Java", "Programming Language");
        data.put("Flask", "Backend Language");
        data.put("SQL", "Database Language");
        data.put("HTML", "Markup Language");

        System.out.println("Printing Keys");
        MapPrinter.printKeys(data);
        // Prints the Output: Java, Flask, SQL, HTML

        System.out.println("\nPrinting Values");
        MapPrinter.printValues(data);
        // Output: Programming Language, Backend Language, Database Language, Markup Language

        System.out.println("\n Printing Pairs(Key Value Pairs)");
        MapPrinter.printPairs(data);
        // Output: Key Value Pairs
    }
}
