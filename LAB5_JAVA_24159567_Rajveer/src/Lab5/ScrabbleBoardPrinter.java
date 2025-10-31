package Lab5;

public class ScrabbleBoardPrinter {

  
    public static void printBoard(char[][] board) {
        if (board == null || board.length == 0) return;

        for (int r = 0; r < board.length; r++) {
            StringBuilder line = new StringBuilder();
            for (int c = 0; c < board[r].length; c++) {
                char ch = board[r][c];
                // show '.' for empty; otherwise uppercase letter
                char out = (ch == '\0' || ch == '.') ? '.' : Character.toUpperCase(ch);
                line.append(out);
                if (c < board[r].length - 1) line.append(' ');
            }
            System.out.println(line);
        }
    }
}
