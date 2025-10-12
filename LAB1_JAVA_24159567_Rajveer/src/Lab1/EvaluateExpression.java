package Lab1;

public class EvaluateExpression {

    public static void main(String[] args) {
        // 1. Arithmetic
        System.out.println(1 + 1);           // 2
        System.out.println(5 - 2 * 3);       // -1
        System.out.println((5 - 2) * 3);     // 9
        System.out.println(4.5 + 6.7);       // 11.2
        System.out.println(3 - 2.1);         // 0.9
        System.out.println(6 / 2);           // 3
        System.out.println(7 / 2);           // 3 (integer division)
        System.out.println(7.0 / 2.0);       // 3.5
        System.out.println(8 % 2);           // 0
        System.out.println(9 % 2);           // 1

        // 2. Comparison
        System.out.println(1 + 1 == 2);      // true
        System.out.println(1 + 1 != 3);      // true
        System.out.println(1 < 3);           // true
        System.out.println(1 > 3);           // false
        System.out.println(3 <= 3);          // true
        System.out.println(3 >= 1);          // true

        // 3. Logical (Gates)
        System.out.println(true && false);   // false
        System.out.println(true || false);   // true
        System.out.println(!false);          // true

        // 4. Strings
        System.out.println("Hello, " + "world!");                    // Hello, world!
        System.out.println("Catch " + 22);                           // Catch 22
        System.out.println("A piece of string".length());            // 16
        System.out.println("ABCDEFG".charAt(3));                     // D (0-based index)
        System.out.println("MMXVIII".toLowerCase());                 // mmxviii
        System.out.println("Yellow Submarine".startsWith("Yellow")); // true

        // 5. Type conversions
        System.out.println((double) 5);                        // 5.0
        System.out.println((int) 5.3);                         // 5
        System.out.println((int) 'a');                         // 97
        System.out.println((char) 120);                        // x
        System.out.println(String.valueOf(1234));           // "1234"
        System.out.println(Integer.parseInt("5678"));      // 5678
        System.out.println(Double.parseDouble("3.14159")); // 3.14159
    }

}


