package LAB4;

import java.util.Scanner;

public class GuessWhat {
    // Private fields
    private int secretNumber;
    private int guessesRemaining;
    private boolean gameOver;
    private boolean gameWon;

    // Constructor
    public GuessWhat() {
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
        // Only allow guesses if the game is not over
        if (gameOver) {
            System.out.println("The game is already over! You cannot make more guesses.");
            return;
        }

        // Decrease the number of remaining guesses by 1
        guessesRemaining--;

        // Check if the guess is correct
        if (guess == secretNumber) {
            gameWon = true;
            gameOver = true;
        }
        else if (guess < secretNumber) {
            System.out.println("Too low!");
        }
        else {
            System.out.println("Too high!");
        }

        // If no guesses remain and the player hasn't won, end the game
        if (guessesRemaining == 0 && !gameWon) {
            System.out.println("No guesses remaining. Game over!");
            gameOver = true;
        }
    }

    // Print the correct number only if the game is over
    public void printCorrectNumber() {
        if (gameOver) {
            System.out.println("The correct number was: " + secretNumber);
        } else {
            System.out.println("The game is not over yet!");
        }
    }

    // Interactive main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessWhat game = new GuessWhat();

        System.out.println("Welcome to Guessing game! You have 10 guesses.");
        System.out.println("Write a number between 1 and 100.");

        while (!game.isGameOver()) {
            System.out.print("\nEnter your guess: ");

            // Validate input
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a number.");
                scanner.next(); // Skip invalid input
                continue;
            }

            int guess = scanner.nextInt();
            game.makeGuess(guess);
            System.out.println("Guesses remaining: " + game.getGuessesRemaining());
        }

        game.printCorrectNumber();
        if (game.isGameWon()) {
            System.out.println("Congratulations! You guessed it right!");
        } else {
            System.out.println("Better luck next time!");
        }

        scanner.close();
    }
}
