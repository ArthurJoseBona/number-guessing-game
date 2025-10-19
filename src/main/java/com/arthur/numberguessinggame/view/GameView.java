package com.arthur.numberguessinggame.view;

public class GameView {
    public void showInitialMenu() {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have some chances to guess the correct number.\n");
    }

    public void showDifficultyMenu() {
        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");
        System.out.printf("\nEnter your choice: ");
    }

    public void showMessage(String message, boolean skipLine) {
        String msg = skipLine ? message + "\n" : message;
        System.out.print(msg);
    }

}
