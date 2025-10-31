package Lab5;

import java.util.Map;

// Map<String, String> map: It accepts a single parameter named map, which must be a Map where both the keys and values are of type String.

//String key: loop iteraters over every element in the set of keys and in each iteration, the current key (a String) is assigned to the variable key.
// map.keySet(): This method call returns a Set view of all the keys in the map.
public class MapPrinter {
    public static void printKeys(Map<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println(key);  // prints the current key to the console, everytime in new line.
        }
    }

    //String value: loop iteraters over every element in the set of values and in each iteration, the current value (a String) is assigned to the variable key.
// map.values(): This method call returns a Set view of all the values in the map.
    public static void printValues(Map<String, String> map) {
        for (String value : map.values()) {
            System.out.println(value);
        }
    }

//Map.Entry<String, String> entry : map.entrySet() : This is a for-each loop in Java that iterates through the key-value pairs (represented by Map.Entry<String, String> objects) contained in a Map named map via its entrySet() method.
    // This function then returns all the key value pairs and prints them.
    public static void printPairs(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
