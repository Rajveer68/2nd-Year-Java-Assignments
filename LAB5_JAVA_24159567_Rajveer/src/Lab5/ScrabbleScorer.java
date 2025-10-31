package Lab5;

import java.util.*;

public class ScrabbleScorer {
    private final Map<Character, Integer> tileScores; //Map to store

    public ScrabbleScorer() {
        // Define the array of all uppercase letter tiles.
        char[] tiles = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        // Define the corresponding score for each tile based on its index.
        int[] scores = {
                1, 3, 3, 2, 1, 4, 2, 4, 1, 8,
                5, 1, 3, 1, 1, 3, 10, 1, 1, 1,
                1, 4, 4, 8, 4, 10
        };

        // Create and populate the tileScores map
        tileScores = new HashMap<>();
        // Loop through both arrays simultaneously to map each letter to its score.
        for (int i = 0; i < tiles.length; i++) {
            tileScores.put(tiles[i], scores[i]);
        }
    }

    // Calculates the score for one letter tile.
    public int scoreForTile(char tile) {
        // Convert the tile to uppercase to match the keys in the map.
        tile = Character.toUpperCase(tile);

        // Check if the tile is a valid letter with a score.
        if (tileScores.containsKey(tile)) {
            // Return the score from the map.
            return tileScores.get(tile);
        }
        // returs 0 if the character is not regognisable.
        return 0;
    }

    // Calculates the score for a full word.
    public int scoreForWord(String word) {
        int total = 0;
        for (char c : word.toCharArray()) {
            total += scoreForTile(c);
        }
        return total;
    }

    // Finds the highest-scoring word in a list of words.
    public String highestScoringWord(List<String> words) {
        // Edge Case handling for empty list
        if (words == null || words.isEmpty()) return null;

        String bestWord = null;
        // Initialize bestScore to the smallest possible integer to ensure the first word score is accepted.
        int bestScore = Integer.MIN_VALUE;

        for (String w : words) {
            // Score Calculation for every word
            int s = scoreForWord(w);


            if (s > bestScore) {  // Updates the best score and store the current word as the new best word.
                bestScore = s;
                bestWord = w;
            }
        }
        return bestWord;
    }
}
