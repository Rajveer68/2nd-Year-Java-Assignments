public class GuessWhat {
    // Private fields
    private int secretNumber;
    private int guessesRemaining;
    private boolean gameOver;
    private boolean gameWon;

    // Constructor
    public GuessWhat() {
        // Math.random() gives a double between 0.0 and 1.0
        // Multiply by 100 and add 1 to get an int between 1 and 100
        this.secretNumber = (int)(Math.random() * 100) + 1;
        this.guessesRemaining = 10;
        this.gameOver = false;
        this.gameWon = false;
    }

    // Get the number of guesses remaining
    public int getGuessesRemaining() {
        return guessesRemaining;
    }

    // Check if the game is over
    public boolean isGameOver() {
        return gameOver;
    }

    // Check if the game has been won
    public boolean isGameWon() {
        return gameWon;
    }

    // Make a guess
    public void makeGuess(int guess) {
        if (gameOver) {
            System.out.println("The game is already over!");
            return;
        }

        guessesRemaining--; // subtract 1 guess

        if (guess == secretNumber) {
            System.out.println("Correct! You win!");
            gameWon = true;
            gameOver = true;
        } else if (guess < secretNumber) {
            System.out.println("Too low!");
        } else {
            System.out.println("Too high!");
        }

        if (guessesRemaining == 0 && !gameWon) {
            System.out.println("No guesses remaining. Game over!");
            gameOver = true;
        }
    }

    // Print the correct number, only if the game is over
    public void printCorrectNumber() {
        if (gameOver) {
            System.out.println("The correct number was: " + secretNumber);
        } else {
            System.out.println("The game is not over yet!");
        }
    }

    // Example test
    public static void main(String[] args) {
        GuessWhat game = new GuessWhat();

        game.makeGuess(50);
        game.makeGuess(75);
        game.makeGuess(25);
        game.makeGuess(10);
        game.printCorrectNumber();
    }
}
