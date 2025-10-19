package com.arthur.numberguessinggame.controller;

import java.util.Scanner;

import com.arthur.numberguessinggame.model.Difficulty;
import com.arthur.numberguessinggame.model.EasyDifficulty;
import com.arthur.numberguessinggame.model.Game;
import com.arthur.numberguessinggame.model.HardDifficulty;
import com.arthur.numberguessinggame.model.MediumDifficulty;
import com.arthur.numberguessinggame.view.GameView;

public class GameController {
    // Scanner for reading user input from the console
    private Scanner sc = new Scanner(System.in);

    // View object responsible for displaying messages and menus
    private GameView view;

    // Constructor: initializes the GameView
    public GameController() {
        view = new GameView();
    }

    // Method to start and manage the game
    public void initGame() {
        // Show initial welcome or menu screen
        view.showInitialMenu();

        boolean validInput = false;
        int choose = -1;

        // Loop until the user enters a valid difficulty option
        while (!validInput) {
            try { 
                view.showDifficultyMenu(); // Show difficulty options
                choose = Integer.parseInt(sc.nextLine()); // Read user input
                validInput = true; // Input is valid if parsing succeeds
            } catch (Exception e) { 
                // Show error message if input is invalid
                view.showMessage("\nInvalid input. Please enter a number.\n", true);
            }   
        }

        // Get the chosen difficulty based on user input
        Difficulty difficulty = getDifficultyByIndex(choose);

        // Show the message associated with the selected difficulty
        view.showMessage(difficulty.getSelectedMessage() + "\n", true);
        view.showMessage("Let's start the game!\n", true);

        // Initialize a new Game object with the selected difficulty
        Game game = new Game(difficulty);

        boolean won = false;

        // Main game loop: keep playing rounds until attempts run out or user wins
        do {
            won = initRound(game);
        } while ((game.getAttemptsLeft() > 0) && !won);

        // Show final result messages
        if (won) {
            view.showMessage("Congratulations! You guessed the correct number in your " 
                             + game.getAttemptsGuessed() + "th attempt.\n", true);
        } else {
            view.showMessage("Game over! You didn’t guess the correct number. The correct answer was " 
                             + game.getRandomNumber() + ".\n", true);
        }
    }

    // Method to handle a single round of the game
    private boolean initRound(Game game) {
        int guessed = -1;
        boolean validInput = false;

        // Loop until the user enters a valid number as their guess
        while (!validInput) {
            try { 
                view.showMessage("You have " + game.getAttemptsLeft() + " tries left.\nEnter your guess: ", false);
                guessed = Integer.parseInt(sc.nextLine());
                validInput = true;
            } catch (Exception e) { 
                // Show error message if input is not a number
                view.showMessage("Invalid input. Please enter a valid guess.", true);
            }   
        }

        // Check if the user's guess is correct
        if (guessed == game.getRandomNumber()) return true;

        // If incorrect, decrement remaining attempts
        game.decrementAttempts();

        // Give a hint to the user
        if (guessed > game.getRandomNumber()) {
            view.showMessage("Incorrect! The number is less than " + guessed + ".\n", true);
        } else {
            view.showMessage("Incorrect! The number is greater than " + guessed + ".\n", true);
        }

        return false; // Round not won
    }

    // Method to return a Difficulty object based on user choice
    private Difficulty getDifficultyByIndex(int index) {
        return switch (index) {
            case 1 -> new EasyDifficulty();
            case 2 -> new MediumDifficulty();
            case 3 -> new HardDifficulty();
            default -> {
                // Show error message if choice is invalid
                view.showMessage("Invalid choice. Please select one of the available options.", true);
                yield null;
            }
        };
    }

}
