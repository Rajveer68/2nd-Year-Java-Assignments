package Lab5;

public class TestScrabbleBoardPrinter {
    public static void main(String[] args) {
        char[][] testBoard = new char[][] {
                { '.', '.', 'w', '.', '.' },
                { '.', '.', 'O', '.', '.' },
                { '.', '.', 'r', '.', '.' },  // even converts the lowercase letters to uppercase
                { 'H', 'E', 'L', 'L', 'O' },
                { '.', '.', 'D', '.', '.' }
        };

        ScrabbleBoardPrinter.printBoard(testBoard);
    }
}
