package Lab5;

import java.util.*;

public class ScrabbleScorer {
    private final Map<Character, Integer> tileScores;

    public ScrabbleScorer() {
        char[] tiles = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        
        int[] scores = {
            1, 3, 3, 2, 1, 4, 2, 4, 1, 8,
            5, 1, 3, 1, 1, 3,10, 1, 1, 1,
            1, 4, 4, 8, 4,10
        };

        // Create and populate the tileScores map
        tileScores = new HashMap<>();
        for (int i = 0; i < tiles.length; i++) {
            tileScores.put(tiles[i], scores[i]);
        }
    }

    // Calculates the score for one letter tile
    public int scoreForTile(char tile) {
        tile = Character.toUpperCase(tile);
        if (tileScores.containsKey(tile)) {
            return tileScores.get(tile);
        }
        return 0;
    }

    // Calculates the score for a word
    public int scoreForWord(String word) {
        int total = 0;
        for (char c : word.toCharArray()) {
            total += scoreForTile(c);
        }
        return total;
    }

    // Finds the highest-scoring word in a list
    public String highestScoringWord(List<String> words) {
        if (words == null || words.isEmpty()) return null;

        String bestWord = null;
        int bestScore = Integer.MIN_VALUE;

        for (String w : words) {
            int s = scoreForWord(w);
            if (s > bestScore) {
                bestScore = s;
                bestWord = w;
            }
        }
        return bestWord;
    }
}
