package com.arthur.numberguessinggame.model;

import java.util.Random;

public class Game {

    // The selected difficulty for this game
    private Difficulty difficulty;

    // Total number of attempts allowed based on difficulty
    private int totalAttempts;

    // Number of attempts remaining for the player
    private int attemptsLeft;

    // The random number the player has to guess
    private int randomNumber;

    // Constructor: initializes a new game with the selected difficulty
    public Game(Difficulty difficulty) {
        this.difficulty = difficulty; // Store difficulty
        this.totalAttempts = this.attemptsLeft = difficulty.getChances(); 
        // Set total attempts and remaining attempts based on difficulty
        this.randomNumber = new Random().nextInt(100 + 1); 
        // Generate a random number between 0 and 100 (inclusive)
    }

    // Method to decrease the number of remaining attempts by 1
    public void decrementAttempts() {
        attemptsLeft--;
    }

    // Getter for remaining attempts
    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    // Getter for the difficulty object
    public Difficulty getDifficulty() {
        return difficulty;
    }

    // Getter for the random number to guess
    public int getRandomNumber() {
        return randomNumber;
    }

    // Getter for total attempts allowed
    public int getTotalAttempts() {
        return totalAttempts;
    }

    // Returns the number of guesses the player has made so far
    public int getAttemptsGuessed() {
        return totalAttempts - attemptsLeft + 1;
    }

}
