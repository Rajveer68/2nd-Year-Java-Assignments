package Lab1;

public class TenGreenBottles {

    // TenGreenBottles - Prints the lyrics to the "Ten Green Bottles" song
    public static void main(String[] args) {
        for (int n = 10; n > 0; n--) {

            // Handle pluralisation for current n
            String word = (n == 1) ? "bottle" : "bottles";  // condition ? valueIfTrue : valueIfFalse

            // Handle pluralisation for n-1
            String nextWord = ((n - 1) == 1) ? "bottle" : "bottles"; // condition ? valueIfTrue : valueIfFalse

            System.out.println(n + " green " + word + ", hanging on the wall");
            System.out.println(n + " green " + word + ", hanging on the wall");
            System.out.print("And if one green " + word + " ");
            System.out.println("should accidentally fall,");
            System.out.println("There'll be " + (n - 1) + " green " + nextWord + ",");
            System.out.println("hanging on the wall!");
            System.out.println(); // blank line between verses
        }
    }
}
