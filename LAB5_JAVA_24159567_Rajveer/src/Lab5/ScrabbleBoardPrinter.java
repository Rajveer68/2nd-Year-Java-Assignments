package Lab5;

public class ScrabbleBoardPrinter {

    public static void printBoard(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            System.out.println("Board is empty.");
            return;
        }

        int size = board[0].length;

        // Calculate the length of the inner horizontal border ('-')
        // (size tiles * 2 characters per tile/space) + 1 space for padding
        int borderInnerLength = size * 2 + 1;

        System.out.print('+');  //Print the top border: +---+...---+
        for (int i = 0; i < borderInnerLength; i++) {
            System.out.print('-');
        }
        System.out.println('+');


        for (int r = 0; r < board.length; r++) {  // Print the board content row by row with left and right borders
            StringBuilder line = new StringBuilder();


            line.append("| "); //Start the row with the left border and a space

            for (int c = 0; c < board[r].length; c++) {
                char ch = board[r][c];

                // Show '.' for empty/null; otherwise uppercase letter
                char out = (ch == '\0' || ch == '.') ? '.' : Character.toUpperCase(ch);
                line.append(out);

                // Add a single space between tiles, but NOT after the last tile
                if (c < board[r].length - 1) {
                    line.append(' ');
                }
            }

            line.append(" |");  // End the row with a space and the right border
            System.out.println(line);
        }

        System.out.print('+');  //Print the bottom border (same as the top)
        for (int i = 0; i < borderInnerLength; i++) {
            System.out.print('-');
        }
        System.out.println('+');
    }
}


// References taken from stack over flow for complex code snippets like char out = (ch == '\0' || ch == '.') ? '.' : Character.toUpperCase(ch);