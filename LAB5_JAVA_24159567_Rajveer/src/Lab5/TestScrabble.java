package Lab5;

import java.util.Arrays;
import java.util.List;

public class TestScrabble {
    public static void main(String[] args) {

        ScrabbleScorer scorer = new ScrabbleScorer();

        // Word Scoring Test
        System.out.println("Score of Rajveer = " + scorer.scoreForWord("Rajveer"));

        System.out.println(" ");

        // --- Highest Scoring Word Test ---

        // List of meaningful tech-related words to compare:
        List<String> wordList = Arrays.asList("JAVA","MEMORY", "API");

        // Scores:
        // JAVA   = J(8)+A(1)+V(4)+A(1) = 14
        // MEMORY = M(3)+E(1)+M(3)+O(1)+R(1)+Y(4) = 13
        // API    = A(1)+P(3)+I(1) = 5

        System.out.println("Best word in list = " + scorer.highestScoringWord(wordList));
        // best word in the list is JAVA because it has higest points
        System.out.println(" ");


        char[][] board = {
                {'M', 'E', 'M', 'O', 'R', 'Y'},
                {'.', '.', '.', '.', '.', '.'},
                {'J', 'A', 'V', 'A', '.', '.'}
        };
        // Assumes ScrabbleBoardPrinter class exists
        ScrabbleBoardPrinter.printBoard(board);
    }
}