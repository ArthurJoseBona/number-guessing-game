package com.arthur.numberguessinggame.view;

public class GameView {

    // Method to display the initial welcome message and game instructions
    public void showInitialMenu() {
        System.out.println("Welcome to the Number Guessing Game!"); // Greeting message
        System.out.println("I'm thinking of a number between 1 and 100."); // Explains the range
        System.out.println("You have some chances to guess the correct number.\n"); // Explains the goal and adds a blank line for spacing
    }

    // Method to display the difficulty selection menu
    public void showDifficultyMenu() {
        System.out.println("Please select the difficulty level:"); // Prompt user to choose difficulty
        System.out.println("1. Easy (10 chances)"); // Easy level description
        System.out.println("2. Medium (5 chances)"); // Medium level description
        System.out.println("3. Hard (3 chances)"); // Hard level description
        System.out.printf("\nEnter your choice: "); // Prompt for input without moving to a new line
    }

    // Method to display a message to the user
    // skipLine parameter controls whether a newline is added after the message
    public void showMessage(String message, boolean skipLine) {
        String msg = skipLine ? message + "\n" : message; // Append newline if skipLine is true
        System.out.print(msg); // Print the message to console
    }

}
