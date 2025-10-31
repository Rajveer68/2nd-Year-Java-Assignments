package Lab5;

import java.util.Arrays;

public class TestScrabble {
    public static void main(String[] args) {
        
        ScrabbleScorer scorer = new ScrabbleScorer();
        System.out.println("Score of HELLO = " + scorer.scoreForWord("HELLO")); // 8
        System.out.println("Score of QUIZ = " + scorer.scoreForWord("QUIZ"));   // 22
        System.out.println("Best word = " + scorer.highestScoringWord(
                Arrays.asList("JAVA", "QUIZ", "CODE")));                        // QUIZ

        char[][] board = {
            {'h', 'e', 'l', 'l', 'o'},
            {'.', '.', '.', '.', '.'},
            {'j', 'a', 'v', 'a', '.'}
        };
        ScrabbleBoardPrinter.printBoard(board);
    }
}
